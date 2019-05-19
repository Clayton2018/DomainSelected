package c.domain.VehicleService;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;

public class Service {


     private int serviceID;
     private String serviceDate, serviceDescription;
     private Vehicle vehicle;
     private Customer customer;


    public Service(){

    }

    public Service(Builder builder){

        this.serviceID = builder.serviceID;
        this.serviceDate = builder.serviceDate;
        this.serviceDescription = builder.serviceDescription;
        this.customer = builder.customer;

    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public static class Builder{

        private int serviceID;
        private String serviceDate, serviceDescription;
        private Customer customer;
        private Vehicle vehicle;


        public Builder serviceID(int serviceID){

            this.serviceID = serviceID;
            return this;

        }

        public Builder serviceDate(String serviceDate){

            this.serviceDate = serviceDate;
            return this;

        }

        public Builder serviceDescription(String serviceDescription){

            this.serviceDescription = serviceDescription;
            return this;

        }

        public Builder customer(Customer customer){

            this.customer = customer;
            return this;

        }

        public Builder vehicle(Vehicle vehicle){

            this.vehicle = vehicle;
            return this;

        }

        public Service build(){

            return new Service(this);

        }

        public String toString(){

            return "Service \n" + "Service ID: " + serviceID
                    + "\n" + "Date: " + serviceDate + "\nDescription: "
                    + serviceDescription + "\nVehicle: " + vehicle
                    + "\nCustomer: " + customer;

        }

    }

}
