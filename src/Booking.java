import java.time.LocalDateTime;

public class Booking {
    private Customer customer;
    private Room room;
    private LocalDateTime timeSlot;

    public Booking(Customer customer, Room room, LocalDateTime timeSlot) {
        this.customer = customer;
        this.room = room;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Booking{customer=" + customer + ", room=" + room + ", timeSlot=" + timeSlot + "}";
    }
}
