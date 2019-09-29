package c.domain.customer;

import javafx.util.Builder;

public class PaymentMethod {

    private double amount;
    private String payType;
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
                    ", payDate='" + payDate + '\'' + "\n";

        }//end toString


    }//end builder inner class


}//end class
