package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("Apache",123,"Sports Bike",12,1500);
        System.out.println(bike);
        bike.maxSpeed("cruiser");
        System.out.println();

        Car car = new Car("Ferrari",9876,"Sports Car",2,10);
        System.out.println(car);
        car.maxSpeed("sportsCar");



    }
}
