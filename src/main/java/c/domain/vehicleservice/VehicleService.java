package c.domain.vehicleservice;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class VehicleService {


    @Id
     private int serviceID;
     private String serviceDate, serviceDescription;


    public VehicleService(){

    }

    public VehicleService(VehicleServiceBuilder builder){

        this.serviceID = builder.serviceID;
        this.serviceDate = builder.serviceDate;
        this.serviceDescription = builder.serviceDescription;

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

    public static class VehicleServiceBuilder {

        private int serviceID;
        private String serviceDate, serviceDescription;


        public VehicleServiceBuilder serviceID(int serviceID){

            this.serviceID = serviceID;
            return this;

        }

        public VehicleServiceBuilder serviceDate(String serviceDate){

            this.serviceDate = serviceDate;
            return this;

        }

        public VehicleServiceBuilder serviceDescription(String serviceDescription) {

            this.serviceDescription = serviceDescription;
            return this;

        }

        public VehicleService build(){

            return new VehicleService(this);

        }

        public String toString(){

            return "VehicleServiceRepository \n" + "VehicleServiceRepository ID: " + serviceID
                    + "\n" + "Date: " + serviceDate + "\nDescription: "
                    + serviceDescription;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof VehicleServiceBuilder)) return false;
            VehicleServiceBuilder that = (VehicleServiceBuilder) o;
            return serviceID == that.serviceID &&
                    Objects.equals(serviceDate, that.serviceDate) &&
                    Objects.equals(serviceDescription, that.serviceDescription);
        }

        @Override
        public int hashCode() {
            return Objects.hash(serviceID, serviceDate, serviceDescription);
        }
    }

}
