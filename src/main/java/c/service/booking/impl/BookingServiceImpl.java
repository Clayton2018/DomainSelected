package c.service.booking.impl;

import c.domain.booking.Booking;
import c.repositories.booking.BookingRepository;
import c.repositories.booking.hibernate.BookingHibernateImpl;
import c.service.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("BookingServiceImpl")
public class BookingServiceImpl implements BookingService {

    private BookingServiceImpl service = null;
    @Autowired
    private BookingRepository repository;

    public BookingServiceImpl() {

        //this.repository = BookingRepositoryImpl.getBookingRepo();

    }

    public BookingServiceImpl getService() {

        if (service == null){

            return new BookingServiceImpl();

        }
        return service;

    }

    @Override
    public Set<Booking> getAll() {

        List<Booking> bookingList = (List<Booking>) repository.findAll();
        return new HashSet<>(bookingList);

    }

    @Override
    public Booking create(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Booking read(String str) {

        return repository.findById(str).orElse(null);

    }

    @Override
    public Booking update(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public void delete(String str) {

        repository.deleteById(str);

    }
}
