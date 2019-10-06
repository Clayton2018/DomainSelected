package c.domain.vehicle;

import javax.persistence.Id;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Vehicle {


    @Id
    private String registrationNumber;

    private String manufacturer;
    private String lastServiceDate;
    private int modelYear;
    private int vinNum;
    private int engineCapacity;
    private double mileage;


    public Vehicle(){}

    protected Vehicle(Builder builder){

        this.manufacturer = builder.manufacturer;
        this.registrationNumber = builder.registrationNumber;
        this.lastServiceDate = builder.lastServiceDate;
        this.engineCapacity = builder.engineCapacity;
        this.modelYear = builder.modelYear;
        this.vinNum = builder.vinNum;
        this.mileage = builder.mileage;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getVinNum() {
        return vinNum;
    }

    public void setVinNum(int vinNum) {
        this.vinNum = vinNum;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public static abstract class Builder{

        private  String manufacturer;
        private String registrationNumber;
        private String lastServiceDate;
        private int modelYear;
        private int vinNum;
        private int engineCapacity;
        private double mileage;

        public Builder manufacturer(String manufacturer){

            this.manufacturer = manufacturer;
            return this;
        }

        public Builder registrationNumber(String registrationNumber){

            this.registrationNumber = registrationNumber;
            return this;

        }

        public Builder lastServiceDate(String lastServiceDate){

            this.lastServiceDate = lastServiceDate;
            return this;

        }

        public Builder modelYear(int modelYear){

            this.modelYear = modelYear;
            return this;

        }

        public Builder vinNum(int vinNum){

            this.vinNum = vinNum;
            return this;

        }

        public Builder engineCapacity(int engineCapacity){

            this.engineCapacity = engineCapacity;
            return this;

        }

        public Builder mileage(double mileage){

            this.mileage = mileage;
            return this;

        }

        public abstract Vehicle build();

        public String toString(){

            return "Vehicle \n" + "manufacturer: " + manufacturer
                    + "\n" + "registration: " + registrationNumber + "\nlast service date: "
                    + lastServiceDate + "\nModel year: " + modelYear
                    + "\nvin number: " + vinNum
                    + "\nEngine capacity: " + engineCapacity
                    + "\nMileage: " + mileage;

        }

    }

}
