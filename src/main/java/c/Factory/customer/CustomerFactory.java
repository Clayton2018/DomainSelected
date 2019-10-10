package c.Factory.customer;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;
import c.util.IdGenerator;

public class CustomerFactory {

    public static Customer getCustomer(String name, String lastName, String number, String address){

        return new Customer.Builder()
                .customerID(IdGenerator.generateId())
                .customerName(name)
                .customerSurname(lastName)
                .customerPhoneNum(number)
                .customerAddress(address)
                .build();

    }

}
