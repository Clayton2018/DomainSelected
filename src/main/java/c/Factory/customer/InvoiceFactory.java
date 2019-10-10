package c.Factory.customer;

import c.domain.customer.Invoice;
import c.util.IdGenerator;

public class InvoiceFactory {

    public static Invoice getInvoice(int invNum, String invDate, String invDesc, double amnt){

        return new Invoice.InvoiceBuilder()
                .invoiceID(IdGenerator.generateId())
                .invoiceNum(invNum)
                .invoiceDate(invDate)
                .description(invDesc)
                .amount(amnt)
                .build();

    }

}
