import java.util.ArrayList;
import java.time.LocalDateTime;

public class BookingList{
    public  ArrayList<Booking> bookings;

    public BookingList(){
        bookings = new ArrayList<Booking>();
    }

    public void createBooking(String name, LocalDateTime timeSlot, int roomID, int numParticipants){
        Booking booking = new Booking(name, roomID, numParticipants, timeSlot);
        bookings.add(booking);
    }

    public void removeBooking(Booking booking){
        bookings.remove(booking);
    }

    public ArrayList<Booking> getBookings(){
        return bookings;
    }

    public Booking getBooking(int index){
        return bookings.get(index);
    }

    public int getSize(){
        return bookings.size();
    }

    public void printBookings(){
        for(Booking booking : bookings){
            System.out.println(booking);
        }
    }
}