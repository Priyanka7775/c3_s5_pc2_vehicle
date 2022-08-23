package com.vehicles;

public class Bike  extends VehicleManufacturer implements Vehicle{
    private int fuelCapacity;
    private int displacement;

    public Bike(String vehicleName,int vehicleModelNumber,String vehicleType,int fuelCapacity, int displacement) {
        super(vehicleName,vehicleModelNumber,vehicleType);
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        String sportsBike="300rpms";
        String cruiser="170rpms";
        if(vehicleType.equals("sportsBike")) {
            System.out.println("Bike type is Sports Bike and its speed is : "+sportsBike);
            return 300;
        } else if (vehicleType.equals("cruiser")) {
           System.out.println("Bike type is Cruiser and its speed is : "+cruiser);
            return 170;
        }
            return 0;
    }

    @Override
    public String toString() {
        return "Manufacturer name: "+getVehicleName() +" , Model: "+vehicleModelNumber+" , Type: "+ vehicleType;
    }
}
