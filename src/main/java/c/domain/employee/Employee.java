package c.domain.employee;

import javafx.util.Builder;

public abstract class Employee {

    private int empID;
    private String empJobTitle;
    private String empName;
    private String empSurname;
    private String empTel;
    private String empAddress;
    private String employmentDate;
    private double empPay;


    public Employee(){}


    public Employee(Builder builder){

        this.empID = builder.empID;
        this.empJobTitle = builder.empJobTitle;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
        this.empTel = builder.empTel;
        this.empAddress = builder.empAddress;
        this.employmentDate = builder.employmentDate;

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpJobTitle() {
        return empJobTitle;
    }

    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getEmpPay() {
        return empPay;
    }

    public void setEmpPay(double empPay) {
        this.empPay = empPay;
    }

    public static abstract class Builder{

        private int empID;
        private String empJobTitle;
        private String empName;
        private String empSurname;
        private String empTel;
        private String empAddress;
        private String employmentDate;
        private double empPay;


        public Builder empID(int empID){

            this.empID = empID;
            return this;

        }

        public Builder empJobTitle(String empJobTitle){

            this.empJobTitle = empJobTitle;
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

        public Builder empPay(double empPay){

            this.empPay = empPay;
            return this;

        }


        public abstract Employee build();

        public String toString(){

            return "Employee \n" + "EmployeeID: " + empID
                    + "\n" + "Job title: " + empJobTitle +"\n"
                    + "Name: " + empName + "\nSurname: "
                    + empSurname + "\nAddress: " + empAddress
                    + "\nTel number: " + empTel
                    + "\nEmployment date: " + employmentDate +"\n"
                    + "Salary/wages (Hourly rate): R" + empPay + "\n";

        }


    }



}
