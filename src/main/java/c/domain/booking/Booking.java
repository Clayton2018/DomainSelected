package c.domain.booking;

import c.domain.customer.Customer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    //@Column(name = "booking_id" , nullable = false, columnDefinition = "VARCHAR(25)")
    private String bookingId;
    private String customerId;
    private String vehicleReg;
    private String bookingDate;
    private String desccription;

    public Booking() {

    }

    public Booking(BookingBuilder builder) {

        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.vehicleReg = builder.vehicleReg;
        this.bookingDate = builder.bookingDate;
        this.desccription = builder.desccription;


    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getDescription() {
        return desccription;
    }

    public static class BookingBuilder{

        private String bookingId, customerId, vehicleReg;
        private String bookingDate;
        private String desccription;

        public BookingBuilder() {

        }//end inner class constructor

        public BookingBuilder bookingId(String bookingId){

            this.bookingId = bookingId;
            return this;

        }

        public BookingBuilder customerId(String customerId){

            this.customerId = customerId;
            return this;

        }

        public BookingBuilder vehicleReg(String vehicleReg){

            this.vehicleReg = vehicleReg;
            return this;

        }

        public BookingBuilder bookingDate(String bookingDate){

            this.bookingDate = bookingDate;
            return this;

        }

        public BookingBuilder desccription(String desccription){

            this.desccription = desccription;
            return this;

        }

        public BookingBuilder copy(Booking booking){

            this.bookingId = booking.bookingId;
            this.customerId = booking.customerId;
            this.vehicleReg = booking.vehicleReg;
            this.bookingDate = booking.bookingDate;
            this.desccription = booking.desccription;
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
            return bookingId.equals(that.bookingId) &&
                    Objects.equals(customerId, that.customerId) &&
                    Objects.equals(vehicleReg, that.vehicleReg) &&
                    Objects.equals(bookingDate, that.bookingDate) &&
                    Objects.equals(desccription, that.desccription);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookingId, customerId, vehicleReg, bookingDate, desccription);
        }

        @Override
        public String toString() {
            return "BookingBuilder{" +
                    "bookingId=" + bookingId +
                    ", customerId=" + customerId +
                    ", vehicleReg=" + vehicleReg +
                    ", bookingDate=" + bookingDate +
                    ", desc='" + desccription + '\'' +
                    '}';
        }

    }//end inner class

}//end booking class
