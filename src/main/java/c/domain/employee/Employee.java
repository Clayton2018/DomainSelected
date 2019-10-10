package c.domain.employee;

//import javafx.util.Builder;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Employee {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private int empID;
    private String empJobTitle;
    private String empName;
    private String empSurname;
    private String empTel;
    private String empAddress;
    private String employmentDate;
    private double salary;


    public Employee(){}


    public Employee(Builder builder){

        this.empID = builder.empID;
        this.empJobTitle = builder.empJobTitle;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
        this.empTel = builder.empTel;
        this.empAddress = builder.empAddress;
        this.employmentDate = builder.employmentDate;
        this.salary = builder.salary;

    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpJobTitle() {
        return empJobTitle;
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

    public double getSalary() {
        return salary;
    }

    public static abstract class Builder{

        private int empID;
        private String empJobTitle;
        private String empName;
        private String empSurname;
        private String empTel;
        private String empAddress;
        private String employmentDate;
        private double salary;


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

        public Builder salary(double salary){

            this.salary = salary;
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
                    + "Salary: R" + salary + "\n";

        }


    }



}
