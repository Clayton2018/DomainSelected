package c.domain.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {


    @Id
    private int customerID;
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String customerPhoneNum;

    public Customer() {

    }

    public Customer(Builder builder) {

        this.customerID = builder.customerID;
        this.customerName = builder.customerName;
        this.customerSurname = builder.customerSurname;
        this.customerAddress = builder.customerAddress;
        this.customerPhoneNum = builder.customerPhoneNum;

    }

    public int getCustomerID() {
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

    public static class Builder {

        private int customerID;
        private String customerName;
        private String customerSurname;
        private String customerAddress;
        private String customerPhoneNum;

        public Builder customerID(int customerID) {

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

        public Customer build(){

            return new Customer(this);

        }


        @Override
        public String toString() {

            return "Customer \n" + "customerID: " + customerID
                    + "\n" + "Name: " + customerName + "\nSurname: "
                    + customerSurname + "\nAddress: " + customerAddress
                    + "\nTel number: " + customerPhoneNum;

        }

    }

}
