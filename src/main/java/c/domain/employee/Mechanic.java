package c.domain.employee;

import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class Mechanic extends Employee {

    private String allocatedBay;


    public Mechanic(){

    }

    private Mechanic(MechanicBuilder builder){

        super(builder);
        this.allocatedBay = builder.allocatedBay;

    }


    public String getDuties() {
        return allocatedBay;
    }

    public static class MechanicBuilder extends Employee.Builder{

        private String allocatedBay;

        public MechanicBuilder(){

            super();

        }

        public MechanicBuilder duties(String duties){

            this.allocatedBay = duties;
            return this;

        }

        @Override
        public Employee build(){

            return new Mechanic(this);

        }

        @Override
        public String toString(){

            return "MechanicBuilder{" + "Allocated work bay: "
                    + allocatedBay + "\n" + super.toString();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MechanicBuilder)) return false;
            MechanicBuilder that = (MechanicBuilder) o;
            return Objects.equals(allocatedBay, that.allocatedBay);
        }

        @Override
        public int hashCode() {
            return Objects.hash(allocatedBay);
        }

    }


}
