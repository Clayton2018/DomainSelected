package c.Domain;


public class Vehicle {

        private String vehicleType, vehicleBrand;
        private int vehicleRegNum;

        private Vehicle(){

        }

        private Vehicle(Builder builder){

            this.vehicleBrand = builder.vehicleBrand;
            this.vehicleType = builder.vehicleType;

        }

        public static class Builder{





        }


}
