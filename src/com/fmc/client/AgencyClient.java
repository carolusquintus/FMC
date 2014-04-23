package com.fmc.client;

import com.fmc.manager.VehicleManagerLazy;
import com.fmc.vehicle.Vehicle;

public class AgencyClient {

	public static void main(String[] args) {
		
		VehicleManagerLazy manager = new VehicleManagerLazy();
		
		Vehicle vehicle1 = manager.createSaloon();
		Vehicle vehicle2 = manager.createSaloon();
		
		//System.out.println(vehicle1.hashCode());
		//System.out.println(vehicle2.hashCode());
		
		System.out.println(vehicle1 == vehicle2);
		
		System.out.println(vehicle1.equals(vehicle2));

	}

}
