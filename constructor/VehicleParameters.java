package com.constructor;

public class VehicleParameters {

	public VehicleParameters() {
		System.out.println("its a electrical vehicle default constructor");
	}//we cannot create more than one default constructor it ships an error. 
	public VehicleParameters(int gares) {
		System.out.println("its having 4 gares param constructor");
	}
	public VehicleParameters(int speed ,String oilType) {
		System.out.println("its maximum speed is 4000km/h oiltype");
	}
	public static void main(String[] args) {
		VehicleParameters vp = new VehicleParameters();//for default constructor
		VehicleParameters vp1 = new VehicleParameters(1);//for 4 gares paramters
		VehicleParameters vp2 = new VehicleParameters(1,"Ashu");//for 4000 maximum speed oilType
		
	}
}
