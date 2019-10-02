package c.repositories.booking;

import c.domain.booking.Booking;
import c.repositories.Repository;

import java.util.Set;

public interface BookingRepository extends Repository<Booking, Integer> {

    Set<Booking> getAll();

}
