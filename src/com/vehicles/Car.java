package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{
    private int seatingCapacity;
    private int mileage;

    public Car(String vehicleName, int vehicleModelNumber, String vehicleType, int seatingCapacity, int mileage) {
        super(vehicleName, vehicleModelNumber, vehicleType);
        this.seatingCapacity = seatingCapacity;
        this.mileage = mileage;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        String sportsCar="300rpms";
        String sedan="170rpms";
        if(vehicleType.equals("sportsCar")) {
            System.out.println("Car type is Sports Car and its speed is : " + sportsCar);
        } else if (vehicleType.equals("sedan")) {
            System.out.println("Car type is Sedan and its speed is : " + sedan);
        }
        return 0;

    }

    public String toString() {
        return "Manufacturer name: "+getVehicleName() +" , Model: "+vehicleModelNumber+" , Type: "+ vehicleType;
    }



}
