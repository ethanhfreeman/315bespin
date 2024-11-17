import java.util.ArrayList;
import java.time.LocalDateTime;

public class EscapeRoomSystem {
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void bookRoom(String customerEmail, int roomId, LocalDateTime timeSlot) {
        Customer customer = customers.stream().filter(c -> c.getEmail().equals(customerEmail)).findFirst().orElse(null);
        Room room = rooms.stream().filter(r -> r.getId() == roomId && r.isAvailable()).findFirst().orElse(null);

        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        if (room == null) {
            System.out.println("Room not available or does not exist!");
            return;
        }

        room.setAvailable(false);
        Booking booking = new Booking(customer, room, timeSlot);
        bookings.add(booking);
        System.out.println("Booking successful: " + booking);
    }

    public void displayRooms() {
        rooms.forEach(System.out::println);
    }

    public void displayBookings() {
        bookings.forEach(System.out::println);
    }
}
