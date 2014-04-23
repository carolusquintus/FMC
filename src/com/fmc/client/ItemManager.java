package com.fmc.client;

import com.fmc.item.Assembly;
import com.fmc.item.Item;
import com.fmc.item.Part;

public class ItemManager {

	public static void main(String[] args) {
		Item nut = new Part("Nut", 5);
		Item bolt = new Part("Bolt", 9);
		Item panel = new Part("Panel", 35);
		
		Item gizmo = new Assembly("Gizmo");
		gizmo.addItem(panel);
		gizmo.addItem(nut);
		gizmo.addItem(bolt);
		
		Item widget = new Assembly("Widget");
		widget.addItem(gizmo);
		widget.addItem(nut);
		
		gizmo.getCost();
		widget.getCost();
		
		System.out.println(nut);
		System.out.println(bolt);
		System.out.println(panel);
		System.out.println(gizmo);
		System.out.println(widget);
	}

}
