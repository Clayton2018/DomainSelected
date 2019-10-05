package c.repositories.booking;

import c.domain.booking.Booking;
import c.repositories.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

    Set<Booking> getAll();

}
