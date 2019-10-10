package c.service.booking;

import c.domain.booking.Booking;
import c.service.Service;

import java.util.Set;

public interface BookingService extends Service<Booking, String> {


    Set<Booking>getAll();

}
