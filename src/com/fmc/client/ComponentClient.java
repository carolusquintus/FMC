package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
import com.fmc.component.Windows;
import com.fmc.factory.component.AbstractComponentFactory;
import com.fmc.factory.component.CarComponentFactory;
import com.fmc.factory.component.VanComponentFactory;

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
 * Client class to test Abstract Factory Pattern
 *
 */
public class ComponentClient {
	
	private static final Logger logger = Logger.getLogger(ComponentClient.class);

	public static void main(String[] args) {

		AbstractComponentFactory factory = null;

		try {
			if (args.length == 1) {

				switch (args[0].trim()) {
				case "car":
					factory = new CarComponentFactory();
					break;
				case "van":
					factory = new VanComponentFactory();
					break;
				}

				Body vehicleBody = factory.createBody();
				Chassis vehicleChassis = factory.createChassis();
				Windows vehicleWindows = factory.createWindows();

				logger.info(vehicleBody.getBodyParts());
				logger.info(vehicleChassis.getChassisParts());
				logger.info(vehicleWindows.getWindowParts());

			} else {
				throw new Exception("Solo se permite un argumento");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
