package c.domain.employee;

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

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
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
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DriverBuilder that = (DriverBuilder) o;

            return licenseType != null ? licenseType.equals(that.licenseType): that.licenseType == null;

        }


    }


}
