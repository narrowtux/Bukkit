package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;

public class BlockLightLevelChangeEvent extends BlockEvent implements Cancellable{
	private int oldLevel;
	private int newLevel;
	private boolean cancel;
	
	public BlockLightLevelChangeEvent(Type type, Block theBlock, int oldLevel, int newLevel) {
		super(type, theBlock);
	}
	public int getNewLevel() {
		return newLevel;
	}
	public void setNewLevel(int newLevel) {
		this.newLevel = newLevel;
	}
	public int getOldLevel() {
		return oldLevel;
	}
	@Override
	public boolean isCancelled() {
		return cancel;
	}
	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
}
