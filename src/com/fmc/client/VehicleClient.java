package com.fmc.client;

import com.fmc.factory.vehicle.CarFactory;
import com.fmc.factory.vehicle.VanFactory;
import com.fmc.factory.vehicle.VehicleFactory;
import com.fmc.factory.vehicle.VehicleFactory.Category;
import com.fmc.factory.vehicle.VehicleFactory.DrivingStyle;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;

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
public class VehicleClient {

	public static void main(String[] args) {

		// AbstractCar car = new Saloon(new TurboEngine(1300), Colour.BLACK);
		// VehicleBuilder builder = new CarBuilder(car);
		// VehicleDirector director = new CarDirector();
		//
		// Vehicle v = director.build(builder);
		//
		// System.out.println(v);

		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(DrivingStyle.ECONOMICAL, Colour.BLUE);
		System.out.println(car);

		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(DrivingStyle.POWERFUL, Colour.WHITE);
		System.out.println(van);

		Vehicle sporty = VehicleFactory.make(Category.CAR,DrivingStyle.ECONOMICAL, Colour.RED);
		System.out.println(sporty);

	}

}
