package c.domain.employee;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Driver extends Employee {


    private String licenseType;

    public Driver(){

    }

    private Driver(DriverBuilder builder){

        super(builder);
        this.licenseType = builder.licenseType;

    }

    public String getLicenseType() {
        return licenseType;
    }

    public static class DriverBuilder extends Employee.Builder{

        private String licenseType;

        public DriverBuilder(){

            super();

        }

        public DriverBuilder licenseType(String licenseType){

            this.licenseType = licenseType;
            return this;

        }

        public DriverBuilder copy(Driver driver){

            this.empID(driver.getEmpID());
            this.empName(driver.getEmpName());
            this.empSurname(driver.getEmpSurname());
            this.empJobTitle(driver.getEmpJobTitle());
            this.empAddress(driver.getEmpAddress());
            this.employmentDate(driver.getEmploymentDate());
            this.empTel(driver.getEmpTel());
            this.licenseType(driver.getLicenseType());
            return this;

        }

        @Override
        public Employee build(){

            return new Driver(this);

        }

        @Override
        public String toString(){

            return "DriverBuilder{" + "type: "
                    + licenseType + "\n" + ""
                    + super.toString();

        }

        @Override
        public int hashCode() {
            return Objects.hash(licenseType);
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DriverBuilder that = (DriverBuilder) o;

            return Objects.equals(licenseType, that.licenseType);

        }


    }


}
