package c.domain.VehicleService;

import c.domain.customer.Customer;

public class Service {


     private int serviceID;
     private String serviceDate, serviceDescription;
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

    public String getServiceDate() {
        return serviceDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public static class Builder{

        private int serviceID;
        private String serviceDate, serviceDescription;
        private Customer customer;


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

        public Service build(){

            return new Service(this);

        }

        public String toString(){

            return "Service \n" + "Service ID: " + serviceID
                    + "\n" + "Date: " + serviceDate + "\nDescription: "
                    + serviceDescription + "\nCustomer: " + customer;

        }

    }

}
