package com.vehicles;

public class VehicleManufacturer {

        private String vehicleName;
        public int vehicleModelNumber;
        public String vehicleType;

    public VehicleManufacturer(String vehicleName, int vehicleModelNumber, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelNumber = vehicleModelNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
            return vehicleName;
        }

        public void setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        public int getVehicleModelNumber() {
            return vehicleModelNumber;
        }

        public void setVehicleModelNumber(int vehicleModelNumber) {
            this.vehicleModelNumber = vehicleModelNumber;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public void setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
        }
    }


