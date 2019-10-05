package c.domain.vehicleservice;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class VehicleService {


    @Id
     private int serviceID;
     private String serviceDate, serviceDescription;
     private Vehicle vehicle;
     private Customer customer;


    public VehicleService(){

    }

    public VehicleService(VehicleServiceBuilder builder){

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


    public static class VehicleServiceBuilder {

        private int serviceID;
        private String serviceDate, serviceDescription;
        private Customer customer;
        private Vehicle vehicle;


        public VehicleServiceBuilder serviceID(int serviceID){

            this.serviceID = serviceID;
            return this;

        }

        public VehicleServiceBuilder serviceDate(String serviceDate){

            this.serviceDate = serviceDate;
            return this;

        }

        public VehicleServiceBuilder serviceDescription(String serviceDescription){

            this.serviceDescription = serviceDescription;
            return this;

        }

        public VehicleServiceBuilder customer(Customer customer){

            this.customer = customer;
            return this;

        }

        public VehicleServiceBuilder vehicle(Vehicle vehicle){

            this.vehicle = vehicle;
            return this;

        }

        public VehicleService build(){

            return new VehicleService(this);

        }

        public String toString(){

            return "VehicleServiceRepository \n" + "VehicleServiceRepository ID: " + serviceID
                    + "\n" + "Date: " + serviceDate + "\nDescription: "
                    + serviceDescription + "\nVehicle: " + vehicle
                    + "\nCustomer: " + customer;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            VehicleServiceBuilder builder = (VehicleServiceBuilder) o;
            return serviceID == builder.serviceID &&
                    serviceDate.equals(builder.serviceDate) &&
                    serviceDescription.equals(builder.serviceDescription) &&
                    customer.equals(builder.customer) &&
                    vehicle.equals(builder.vehicle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(serviceID, serviceDate, serviceDescription, customer, vehicle);
        }
    }

}
