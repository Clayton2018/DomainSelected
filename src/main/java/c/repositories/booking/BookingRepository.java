package c.repositories.booking;

import c.domain.booking.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BookingRepository extends CrudRepository<Booking, String> {

    //Set<Booking> getAll();

}
