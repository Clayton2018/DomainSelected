package c.Domain;


import sun.security.provider.certpath.Builder;

public class Vehicle {

        private String vehicleType, vehicleBrand;
        private int vehicleRegNum;

        private Vehicle(){

        }

        private Vehicle(Builder builder ){

            this.vehicleBrand = builder.vehicleBrand;
        }


}
