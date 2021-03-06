package c.Factory.booking;

import c.domain.booking.Booking;
import c.util.IdGenerator;

import java.util.Date;

public class BookingFactory {

    public static Booking getBooking( String customerID, String vehicleReg, String bookingDate, String desc){

        return new Booking.BookingBuilder()
                .bookingId(IdGenerator.generateId())
                .customerId(customerID)
                .vehicleReg(vehicleReg)
                .bookingDate(bookingDate)
                .description(desc)
                .build();

    }

}
