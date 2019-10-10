package c.domain.booking;

import c.domain.customer.Customer;
import org.hibernate.annotations.GenericGenerator;

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
    private String bookingId;
    private String customerId;
    private String vehicleReg;
    private Date bookingDate;
    private String desc;

    public Booking() {

    }

    public Booking(BookingBuilder builder) {

        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.vehicleReg = builder.vehicleReg;
        this.bookingDate = builder.bookingDate;
        this.desc = builder.desc;


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

    public Date getBookingDate() {
        return bookingDate;
    }

    public String getDesc() {
        return desc;
    }

    public static class BookingBuilder{

        private String bookingId, customerId, vehicleReg;
        private Date bookingDate;
        private String desc;

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

        public BookingBuilder bookingDate(Date bookingDate){

            this.bookingDate = bookingDate;
            return this;

        }

        public BookingBuilder desc(String desc){

            this.desc = desc;
            return this;

        }

        public BookingBuilder copy(Booking booking){

            this.bookingId = booking.bookingId;
            this.customerId = booking.customerId;
            this.vehicleReg = booking.vehicleReg;
            this.bookingDate = booking.bookingDate;
            this.desc = booking.desc;
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
                    Objects.equals(bookingDate, that.bookingDate) &&
                    Objects.equals(desc, that.desc);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookingId, customerId, vehicleReg, bookingDate, desc);
        }

        @Override
        public String toString() {
            return "BookingBuilder{" +
                    "bookingId=" + bookingId +
                    ", customerId=" + customerId +
                    ", vehicleReg=" + vehicleReg +
                    ", bookingDate=" + bookingDate +
                    ", desc='" + desc + '\'' +
                    '}';
        }

    }//end inner class

}//end booking class
