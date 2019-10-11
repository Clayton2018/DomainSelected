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
    @Column(name = "invoice_id" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String invoiceID;
    private int invoiceNum;
    private String invoiceDate;
    private String description;
    private double amount;

    public Invoice() {
    }

    public Invoice(InvoiceBuilder builder) {

        this.invoiceID = builder.invoiceID;
        this.invoiceDate = builder.invoiceDate;
        this.invoiceNum = builder.invoiceNum;
        this.description = builder.description;
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

    public static class InvoiceBuilder{

        private String invoiceID;
        private String invoiceDate;
        private int invoiceNum;
        private String description;
        private double amount;

        public InvoiceBuilder invoiceID(String invoiceID){

            this.invoiceID = invoiceID;
            return this;

        }

        public InvoiceBuilder invoiceDate(String invoiceDate){

            this.invoiceDate = invoiceDate;
            return this;

        }

        public InvoiceBuilder invoiceNum(int invoiceNum){

            this.invoiceNum = invoiceNum;
            return this;

        }

        public InvoiceBuilder description(String description){

            this.description = description;
            return this;

        }

        public InvoiceBuilder amount(double amount){

            this.amount = amount;
            return this;

        }

        public Invoice build(){

            return new Invoice(this);

        }

        @Override
        public String toString() {
            return "InvoiceBuilder{" +
                    "InvoiceID='" + invoiceID + '\'' +
                    "invoiceDate='" + invoiceDate + '\'' +
                    ", invoiceNum=" + invoiceNum +
                    ", description='" + description + '\'' +
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
                    invoiceDate.equals(that.invoiceDate) &&
                    description.equals(that.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(invoiceDate, invoiceNum, description, amount);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice)) return false;
        Invoice invoice = (Invoice) o;
        return getInvoiceNum() == invoice.getInvoiceNum() &&
                Double.compare(invoice.getAmount(), getAmount()) == 0 &&
                Objects.equals(getInvoiceID(), invoice.getInvoiceID()) &&
                Objects.equals(getInvoiceDate(), invoice.getInvoiceDate()) &&
                Objects.equals(getDescription(), invoice.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvoiceID(), getInvoiceNum(), getInvoiceDate(), getDescription(), getAmount());
    }

}
