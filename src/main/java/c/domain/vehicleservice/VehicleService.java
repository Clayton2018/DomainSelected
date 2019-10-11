package c.domain.vehicleservice;

import c.domain.customer.Customer;
import c.domain.employee.VehicleInspector;
import c.domain.vehicle.Vehicle;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class VehicleService {


    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "service_id" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String serviceID;
    private String serviceDescription;
    private Date serviceDate;


    public VehicleService(){

    }

    public VehicleService(VehicleServiceBuilder builder){

        this.serviceID = builder.serviceID;
        this.serviceDate = builder.serviceDate;
        this.serviceDescription = builder.serviceDescription;

    }

    public String getServiceID() {
        return serviceID;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public static class VehicleServiceBuilder {

        private String serviceID;
        private String serviceDescription;
        private Date serviceDate;


        public VehicleServiceBuilder serviceID(String serviceID){

            this.serviceID = serviceID;
            return this;

        }

        public VehicleServiceBuilder serviceDate(Date serviceDate){

            this.serviceDate = serviceDate;
            return this;

        }

        public VehicleServiceBuilder serviceDescription(String serviceDescription) {

            this.serviceDescription = serviceDescription;
            return this;

        }

        public VehicleServiceBuilder copy(VehicleService vehicleService){

            this.serviceID(vehicleService.serviceID);
            this.serviceDescription(vehicleService.serviceDescription);
            this.serviceDate(vehicleService.serviceDate);
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
            return Objects.equals(serviceID, that.serviceID) &&
                    Objects.equals(serviceDescription, that.serviceDescription) &&
                    Objects.equals(serviceDate, that.serviceDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(serviceID, serviceDescription, serviceDate);
        }
    }

}
