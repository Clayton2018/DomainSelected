package c.Factory.customer;

import c.domain.customer.Customer;
import c.domain.vehicle.Vehicle;

public class CustomerFactory {

    public static Customer getCustomer(String name, String lastName, String number, String address, Vehicle vehicle){

        return (Customer) new Customer.Builder().build();

    }

}
