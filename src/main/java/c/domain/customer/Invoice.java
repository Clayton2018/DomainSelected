package c.domain.customer;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Invoice {



    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String invoiceID;
    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    private String vehicleReg;
    private String description;
    private double amount;

    public Invoice() {
    }

    public Invoice(InvoiceBuilder builder) {

        this.invoiceID = builder.invoiceID;
        this.invoiceDate = builder.invoiceDate;
        this.invoiceNum = builder.invoiceNum;
        this.description = builder.description;
        this.customerName = builder.customerName;
        this.vehicleReg = builder.vehicleReg;
        this.amount = builder.amount;

    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public static class InvoiceBuilder {

        private String invoiceID;
        private String invoiceDate;
        private int invoiceNum;
        private String description;
        private String customerName;
        private String vehicleReg;
        private double amount;

        public InvoiceBuilder invoiceID(String invoiceID) {

            this.invoiceID = invoiceID;
            return this;

        }

        public InvoiceBuilder invoiceDate(String invoiceDate) {

            this.invoiceDate = invoiceDate;
            return this;

        }

        public InvoiceBuilder invoiceNum(int invoiceNum) {

            this.invoiceNum = invoiceNum;
            return this;

        }

        public InvoiceBuilder description(String description) {

            this.description = description;
            return this;

        }

        public InvoiceBuilder customerName(String custName) {

            this.customerName = custName;
            return this;

        }

        public InvoiceBuilder vehicleReg(String vehicleReg) {

            this.vehicleReg = vehicleReg;
            return this;

        }

        public InvoiceBuilder amount(double amount) {

            this.amount = amount;
            return this;

        }

        public InvoiceBuilder copy(Invoice invoice){

            this.invoiceID = invoice.invoiceID;
            this.invoiceDate = invoice.invoiceDate;
            this.invoiceNum = invoice.invoiceNum;
            this.description = invoice.description;
            this.customerName = invoice.customerName;
            this.vehicleReg = invoice.vehicleReg;
            this.amount = invoice.amount;
            return this;

        }

        public Invoice build() {

            return new Invoice(this);

        }

        @Override
        public String toString() {
            return "InvoiceBuilder{" +
                    "InvoiceID='" + invoiceID + '\'' +
                    "invoiceDate='" + invoiceDate + '\'' +
                    ", invoiceNum=" + invoiceNum +
                    ", description='" + description + '\'' +
                    ", customer name='" + customerName + '\'' +
                    ", vehicle reg='" + vehicleReg + '\'' +
                    ", amount=" + amount +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof InvoiceBuilder)) return false;
            InvoiceBuilder that = (InvoiceBuilder) o;
            return invoiceNum == that.invoiceNum &&
                    Double.compare(that.amount, amount) == 0 &&
                    invoiceID.equals(that.invoiceID) &&
                    Objects.equals(invoiceDate, that.invoiceDate) &&
                    Objects.equals(description, that.description) &&
                    Objects.equals(customerName, that.customerName) &&
                    Objects.equals(vehicleReg, that.vehicleReg);
        }

        @Override
        public int hashCode() {
            return Objects.hash(invoiceID, invoiceDate, invoiceNum, description, customerName, vehicleReg, amount);
        }
    }

}
