package c.domain.customer;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String customerID;
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String customerPhoneNum;
    private boolean hasInsurance = false;

    public Customer() {

    }

    public Customer(Builder builder) {

        this.customerID = builder.customerID;
        this.customerName = builder.customerName;
        this.customerSurname = builder.customerSurname;
        this.customerAddress = builder.customerAddress;
        this.customerPhoneNum = builder.customerPhoneNum;
        this.hasInsurance = builder.hasInsurance;

    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public static class Builder {

        private String customerID;
        private String customerName;
        private String customerSurname;
        private String customerAddress;
        private String customerPhoneNum;
        private boolean hasInsurance;

        public Builder customerID(String customerID) {

            this.customerID = customerID;
            return this;

        }

        public Builder customerName(String customerName) {

            this.customerName = customerName;
            return this;

        }

        public Builder customerSurname(String customerSurname) {

            this.customerSurname = customerSurname;
            return this;

        }

        public Builder customerAddress(String customerAddress) {

            this.customerAddress = customerAddress;
            return this;

        }

        public Builder customerPhoneNum(String customerPhoneNum) {

            this.customerPhoneNum = customerPhoneNum;
            return this;

        }

        public Builder hasInsurance(boolean hasInsurance){

            this.hasInsurance = hasInsurance;
            return this;

        }

        public Customer build(){

            return new Customer(this);

        }

        public Builder copy(Customer customer){

            this.customerID = customer.customerID;
            this.customerName = customer.customerName;
            this.customerSurname = customer.customerSurname;
            this.customerAddress = customer.customerAddress;
            this.customerPhoneNum = customer.customerPhoneNum;
            this.hasInsurance = customer.hasInsurance;
            return this;

        }


        @Override
        public String toString() {

            return "Customer \n" + "customerID: " + customerID
                    + "\n" + "Name: " + customerName + "\nSurname: "
                    + customerSurname + "\nAddress: " + customerAddress
                    + "\nTel number: " + customerPhoneNum
                    + "Insurance: " + hasInsurance;

        }

    }

}
