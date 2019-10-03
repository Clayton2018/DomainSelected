package c.service.booking.impl;

import c.domain.booking.Booking;
import c.repositories.booking.BookingRepository;
import c.repositories.booking.impl.BookingRepositoryImpl;
import c.service.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class BookingServiceImpl implements BookingService {

    private BookingServiceImpl service = null;

    @Autowired
    private BookingRepository repository;

    public BookingServiceImpl() {

        this.repository = BookingRepositoryImpl.getBookingRepo();

    }

    public BookingServiceImpl getService() {

        if (service == null){

            return new BookingServiceImpl();

        }
        return service;

    }

    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }

    @Override
    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    @Override
    public Booking read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Booking update(Booking booking) {
        return repository.update(booking);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
