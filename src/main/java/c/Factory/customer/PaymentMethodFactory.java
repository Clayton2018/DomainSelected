package c.Factory.customer;

import c.domain.customer.PaymentMethod;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(double amnt, String method, String date){

        return new PaymentMethod.Builder()
                .amount(amnt)
                .payType(method)
                .payDate(date)
                .build();

    }

}
