package c.domain.customer;

//import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class PaymentMethod {

    @Id
    private String payType;
    private double amount;
    private String payDate;


    public PaymentMethod() {

    }//end empty constructor


    public PaymentMethod(Builder builder) {

        this.amount = builder.amount;
        this.payType = builder.payType;
        this.payDate = builder.payDate;

    }//end Builder constructor

    public double getAmount() {
        return amount;
    }

    public String getPayType() {
        return payType;
    }

    public String getPayDate() {
        return payDate;
    }

    public static class Builder {

        private double amount;
        private String payType;
        private String payDate;

        public Builder amount(double amount){

            this.amount = amount;
            return this;

        }

        public Builder payType(String payType){

            this.payType = payType;
            return this;

        }

        public Builder payDate(String payDate){

            this.payDate = payDate;
            return this;

        }

        public PaymentMethod build(){

            return new PaymentMethod(this);

        }

        @Override
        public String toString() {
            return "Builder\n" +
                    "amount=" + amount +
                    ", payType='" + payType + '\'' +
                    ", payDate='" + payDate + '\'' +
                    super.toString();

        }//end toString

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return Double.compare(builder.amount, amount) == 0 &&
                    Objects.equals(payType, builder.payType) &&
                    Objects.equals(payDate, builder.payDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount, payType, payDate);
        }
    }//end builder inner class


}//end class
