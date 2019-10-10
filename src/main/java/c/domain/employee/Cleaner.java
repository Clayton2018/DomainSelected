package c.domain.employee;

import javax.persistence.Entity;
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


    public static class CleanerBuilder extends Employee.Builder{

        private int officeRoom;

        public CleanerBuilder(){

            super();

        }

        public CleanerBuilder officeRoom(int officeRoom){

            this.officeRoom = officeRoom;
            return this;

        }

        @Override
        public Employee build(){

            return new Cleaner(this);

        }

        public CleanerBuilder copy(Cleaner cleaner){

            this.empID(cleaner.getEmpID());
            this.empName(cleaner.getEmpName());
            this.empSurname(cleaner.getEmpSurname());
            this.empJobTitle(cleaner.getEmpJobTitle());
            this.empAddress(cleaner.getEmpAddress());
            this.employmentDate(cleaner.getEmploymentDate());
            this.empTel(cleaner.getEmpTel());
            this.officeRoom(cleaner.getOfficeRoom());
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
    }



}
