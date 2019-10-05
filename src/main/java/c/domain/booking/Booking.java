package c.domain.booking;

import c.domain.customer.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    private int bookingId;

    private int customerId;
    private int vehicleReg;
    private String bookingDate;

    public Booking() {

    }

    public Booking(BookingBuilder builder) {

        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.vehicleReg = builder.vehicleReg;
        this.bookingDate = builder.bookingDate;

    }

    public int getBookingId() {
        return bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getVehicleReg() {
        return vehicleReg;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public static class BookingBuilder{

        private int bookingId, customerId, vehicleReg;
        private String bookingDate;

        public BookingBuilder() {

        }//end inner class constructor

        public BookingBuilder bookingId(int bookingId){

            this.bookingId = bookingId;
            return this;

        }

        public BookingBuilder customerId(int customerId){

            this.customerId = customerId;
            return this;

        }

        public BookingBuilder vehicleReg(int vehicleReg){

            this.vehicleReg = vehicleReg;
            return this;

        }

        public BookingBuilder bookingDate(String bookingDate){

            this.bookingDate = bookingDate;
            return this;

        }

        public BookingBuilder copy(Booking booking){

            this.bookingId = booking.bookingId;
            this.customerId = booking.customerId;
            this.vehicleReg = booking.vehicleReg;
            this.bookingDate = booking.bookingDate;
            return this;

        }

        public Booking build(){

            return new Booking(this);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BookingBuilder)) return false;
            BookingBuilder that = (BookingBuilder) o;
            return bookingId == that.bookingId &&
                    customerId == that.customerId &&
                    vehicleReg == that.vehicleReg &&
                    bookingDate.equals(that.bookingDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookingId, customerId, vehicleReg, bookingDate);
        }

        @Override
        public String toString() {
            return "BookingBuilder" + "\n" +
                    "bookingId=" + bookingId +
                    ", customerId=" + customerId +
                    ", vehicleReg=" + vehicleReg +
                    ", bookingDate='" + bookingDate + '\'' +
                    "\n";
        }

    }//end inner class

}//end booking class
