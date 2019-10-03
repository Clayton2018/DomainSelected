package c.service.booking;

import c.domain.booking.Booking;
import c.service.Service;

import java.util.Set;

public interface BookingService extends Service<Booking, Integer> {


    Set<Booking>getAll();

}
