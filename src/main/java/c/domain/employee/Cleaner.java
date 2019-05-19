package c.domain.employee;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cleaner extends Employee{

      private int[] officeRoom;


    public Cleaner(){

    }

    public Cleaner(CleanerBuilder builder){

        super(builder);
        this.officeRoom = builder.officeRoom;

    }

    public int[] getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(int[] officeRoom) {
        this.officeRoom = officeRoom;
    }

    public static class CleanerBuilder extends Employee.Builder{

        private int[] officeRoom;

        public CleanerBuilder OfficeRoom(int[] officeRoom){

            this.officeRoom = officeRoom;
            return this;

        }

        @Override
        public String toString() {

            return "CleanerBuilder{" + " Office:"
                    + Arrays.toString(officeRoom) + "}\n" +
                    super.toString();
        }

        @Override
        public boolean equals(Object obj) {

            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;

            CleanerBuilder that = (CleanerBuilder) obj;

            return Arrays.equals(officeRoom, that.officeRoom);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(officeRoom);
        }

        @Override
        public Employee build(){

            return new Cleaner(this);

        }

    }



}
