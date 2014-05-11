package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.item.Assembly;
import com.fmc.item.Item;
import com.fmc.item.Part;

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
 * Client class to test Composite Pattern
 *
 */
public class ItemManager {
	
	private static final Logger log = Logger.getLogger(ItemManager.class);

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
		
		log.info(nut);
		log.info(bolt);
		log.info(panel);
		log.info(gizmo);
		log.info(widget);
	}

}
