package c.domain.employee;

import c.domain.vehicle.Vehicle;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class Mechanic extends Employee {

    private String duties;


    public Mechanic(){

    }

    private Mechanic(MechanicBuilder builder){

        super(builder);
        this.duties = builder.duties;

    }


    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public static class MechanicBuilder extends Employee.Builder{

        private String duties;

        public MechanicBuilder(){

            super();

        }

        public MechanicBuilder duties(String duties){

            this.duties = duties;
            return this;

        }

        @Override
        public Employee build(){

            return new Mechanic(this);

        }

        @Override
        public String toString(){

            return "MechanicBuilder{" + "duties: "
                    + duties + "\n" + super.toString();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MechanicBuilder)) return false;
            MechanicBuilder that = (MechanicBuilder) o;
            return Objects.equals(duties, that.duties);
        }

        @Override
        public int hashCode() {
            return Objects.hash(duties);
        }

    }


}
