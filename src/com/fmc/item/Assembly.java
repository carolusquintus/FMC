package com.fmc.item;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends Item {

	public List<Item> items;

	public Assembly(final String description) {
		super(description, 0);
		this.items = new ArrayList<Item>();
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item[] getItems() {
		return items.toArray(new Item[items.size()]);
	}

	@Override
	public int getCost() {
		int total = 0;

		for (Item item : items) {
			total += item.getCost();
		}
		return total;
	}

}
