package c.Factory.booking;

import c.domain.booking.Booking;

public class BookingFactory {

    public static Booking getBooking(int bookingID, int customerID, int vehicleReg, String bookingDate){

        return new Booking.BookingBuilder()
                .bookingId(bookingID)
                .customerId(customerID)
                .vehicleReg(vehicleReg)
                .bookingDate(bookingDate)
                .build();

    }

}
