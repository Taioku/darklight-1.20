package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.FilledMapItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.map.MapState;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.MortarEntity;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import net.taioku.darklight.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

import static org.apache.commons.lang3.RandomUtils.nextFloat;

public class ModPillarBlock extends BlockWithEntity implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public ModPillarBlock(Settings settings) {
        super(settings
                .nonOpaque());
        setDefaultState(getDefaultState()
                .with(WATERLOGGED, false));;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0.0125, 0.0625, 0.9375, 0.2, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.2, 0.1875, 0.8125, 0.3875, 0.8125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.3875, 0.3125, 0.6875, 0.825, 0.6875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0.825, 0.0625, 0.9375, 1.01250, 0.9375));
        return shape;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PillarEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.MODEL;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;
        world.updateListeners(pos, state, state, Block.NOTIFY_LISTENERS);

        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);
        if (!player.getStackInHand(hand).isEmpty()) {
            if (blockEntity.getStack(0).isEmpty()) {
                world.playSound(null, pos, SoundEvents.ITEM_BOOK_PUT, SoundCategory.BLOCKS, 1.0f, nextFloat(1.0f, 2.0f));
                // Put the stack the player is holding into the inventory
                blockEntity.setStack(0, player.getStackInHand(hand).copy());

                Darklight.LOGGER.info("\n"+"\n"+"\n"+"\nStack set to 2: " + player.getStackInHand(hand).copy() + "\nFor: " + world.getBlockEntity(pos)+"\n"+"\n"+"\n");

                // Remove the stack from the player's hand
                player.getStackInHand(hand).setCount(0);
            } else {
                world.playSound(null, pos, SoundEvents.ITEM_BOOK_PUT, SoundCategory.BLOCKS, 1.0f, nextFloat(1.0f, 2.0f));
                ItemStack itemStack = player.getStackInHand(hand).copy();
                player.getStackInHand(hand).setCount(0);
                player.setStackInHand(hand, blockEntity.getStack(0));
                blockEntity.setStack(0, itemStack);
            }
            return ActionResult.SUCCESS;
        } else {
            // If the player is not holding anything we'll get give him the items in the block entity one by one

            // Find the first slot that has an item and give it to the player
            if (!blockEntity.getStack(0).isEmpty()) {
                world.playSound(null, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 0.5f, nextFloat(1.0f, 2.0f));
                // Give the player the stack in the inventory
                player.getInventory().offerOrDrop(blockEntity.getStack(0));
                // Remove the stack from the inventory
                blockEntity.removeStack(0);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof PillarEntity) {
            ItemScatterer.spawn(world, pos, (PillarEntity)blockEntity);
            world.updateComparators(pos, this);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
        }
    }
}
