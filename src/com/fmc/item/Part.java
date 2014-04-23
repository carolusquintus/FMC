package com.fmc.item;

public class Part extends Item {

	public Part(final String description, final int cost) {
		super(description, cost);
	}

	@Override
	public void addItem(Item item) {
	}

	@Override
	public void removeItem(Item item) {
	}

	@Override
	public Item[] getItems() {
		return new Item[0];
	}

}
