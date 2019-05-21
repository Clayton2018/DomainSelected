package c.domain.employee;

import javafx.util.Builder;

public abstract class Employee {

    private int empID;
    private String empName;
    private String empSurname;
    private String empTel;
    private String empAddress;
    private String employmentDate;

    public Employee(){};

    public Employee(Builder builder){

        this.empID = builder.empID;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
        this.empTel = builder.empTel;
        this.empAddress = builder.empAddress;
        this.employmentDate = builder.employmentDate;

    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getEmpTel() {
        return empTel;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public static abstract class Builder{

        private int empID;
        private String empName;
        private String empSurname;
        private String empTel;
        private String empAddress;
        private String employmentDate;


        public Builder empID(int empID){

            this.empID = empID;
            return this;

        }

        public Builder empName(String empName){

            this.empName = empName;
            return this;

        }

        public Builder empSurname(String empSurname){

            this.empSurname = empSurname;
            return this;

        }

        public Builder empTel(String empTel){

            this.empTel = empTel;
            return this;

        }

        public Builder empAddress(String empAddress){

            this.empAddress = empAddress;
            return this;

        }

        public Builder employmentDate(String employmentDate){

            this.employmentDate = employmentDate;
            return this;

        }

        public abstract Employee build();

        public String toString(){

            return "Employee \n" + "EmployeeID: " + empID
                    + "\n" + "Name: " + empName + "\nSurname: "
                    + empSurname + "\nAddress: " + empAddress
                    + "\nTel number: " + empTel
                    + "\nEmployment date: " + employmentDate;

        }


    }



}
