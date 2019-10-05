package c.repositories.booking.hibernate;

import c.domain.booking.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingHibernateImpl extends CrudRepository<Booking, Integer> {

}
