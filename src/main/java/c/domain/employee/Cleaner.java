package c.domain.employee;

import javax.persistence.Entity;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Cleaner extends Employee{

      private int officeRoom;


    public Cleaner(){

    }

    public Cleaner(CleanerBuilder builder){

        super(builder);
        this.officeRoom = builder.officeRoom;

    }

    public int getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(int officeRoom) {
        this.officeRoom = officeRoom;
    }

    public static class CleanerBuilder extends Employee.Builder{

        private int officeRoom;

        public CleanerBuilder OfficeRoom(int officeRoom){

            this.officeRoom = officeRoom;
            return this;

        }

        @Override
        public String toString() {

            return "CleanerBuilder{" + " Office:"
                    + officeRoom + "}\n" +
                    super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CleanerBuilder)) return false;
            CleanerBuilder that = (CleanerBuilder) o;
            return officeRoom == that.officeRoom;
        }

        @Override
        public int hashCode() {
            return Objects.hash(officeRoom);
        }

        @Override
        public Employee build(){

            return new Cleaner(this);

        }

    }



}
