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
public abstract class Item {
	private String description;
	private int cost;

	public Item(final String description, final int cost) {
		this.description = description;
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public int getCost() {
		return cost;
	}

	public abstract void addItem(Item item);

	public abstract void removeItem(Item item);

	public abstract Item[] getItems();

	@Override
	public String toString() {
		return new StringBuilder(description).append(" (cost ").append(getCost()).append(")").toString();
	}
}
