package c.Factory.customer;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;

public class CustomerFactory {

    public static Customer getCustomer(int cID, String name, String lastName, String number, String address){

        return new Customer.Builder()
                .customerID(cID)
                .customerName(name)
                .customerSurname(lastName)
                .customerPhoneNum(number)
                .customerAddress(address)
                .build();

    }

}
