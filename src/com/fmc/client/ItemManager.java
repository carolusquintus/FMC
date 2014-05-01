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
 */
public class ItemManager {
	
	private static final Logger logger = Logger.getLogger(ItemManager.class);

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
		
		logger.info(nut);
		logger.info(bolt);
		logger.info(panel);
		logger.info(gizmo);
		logger.info(widget);
	}

}
