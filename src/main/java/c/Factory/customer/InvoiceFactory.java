package c.Factory.customer;

import c.domain.customer.Invoice;

public class InvoiceFactory {

    public static Invoice getInvoice(int invNum, String invDate, String invDesc, double amnt){

        return new Invoice.InvoiceBuilder()
                .invoiceNum(invNum)
                .invoiceDate(invDate)
                .description(invDesc)
                .amount(amnt)
                .build();

    }

}
