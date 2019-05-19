package c.domain.employee;

import c.domain.vehicle.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mechanic extends Employee {

    @JsonProperty("duties")
    private String duties;
    private List<Vehicle> vehicles;


    public Mechanic(){

    }

    private Mechanic(MechanicBuilder builder){

        super(builder);
        this.duties = builder.duties;
        this.vehicles = builder.vehicles;


    }


    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public static class MechanicBuilder extends Employee.Builder{

        private String duties;
        private List<Vehicle> vehicles;

        public MechanicBuilder(){

            super();

        }

        public MechanicBuilder duties(String duties){

            this.duties = duties;
            return this;

        }

        public MechanicBuilder vehicles(List<Vehicle> vehicles){

            this.vehicles = vehicles;
            return this;

        }

        @Override
        public Employee build(){

            return new Mechanic(this);

        }

        @Override
        public String toString(){

            return "MechanicBuilder{" + "duties: "
                    + duties + "\n" + "Vehicles{"
                    + vehicles + super.toString();

        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MechanicBuilder that = (MechanicBuilder) o;

            if(duties != null ? !duties.equals(that.duties) : that.duties != null)
                return false;
            return vehicles != null ? vehicles.equals(that.vehicles): that.vehicles == null;

        }

        @Override
        public int hashCode(){

            int result = duties != null ? duties.hashCode() : 0;
            result = 20 * result + (vehicles != null ? vehicles.hashCode(): 0);
            return result;

        }
    }


}
