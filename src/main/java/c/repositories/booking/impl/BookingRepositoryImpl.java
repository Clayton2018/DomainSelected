package c.repositories.booking.impl;

import c.domain.booking.Booking;
import c.repositories.booking.BookingRepository;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BookingRepositoryImpl implements BookingRepository {

    private static BookingRepositoryImpl bookingRepo = null;
    private Map<Integer, Booking> bookingCode;

    public BookingRepositoryImpl() {

        bookingCode = new HashMap<>();

    }

    public static BookingRepositoryImpl getBookingRepo() {

        if (bookingRepo == null){

            return new BookingRepositoryImpl();

        }

        return bookingRepo;

    }


    @Override
    public Set<Booking> getAll() {
        return new HashSet<>(bookingCode.values());
    }

    @Override
    public Booking create(Booking booking) {

        bookingCode.put(booking.getBookingId(), booking);
        return booking;

    }

    @Override
    public Booking read(Integer integer) {

        return bookingCode.get(integer);
    }

    @Override
    public Booking update(Booking booking) {

        bookingCode.replace(booking.getBookingId(), booking);
        return bookingCode.get(booking.getBookingId());
    }

    @Override
    public void delete(Integer integer) {

        bookingCode.remove(integer);

    }
}
