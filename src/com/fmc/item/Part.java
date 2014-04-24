package com.fmc.item;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Apr 23, 2014
 *
 * @author carolus
 *
 */
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
