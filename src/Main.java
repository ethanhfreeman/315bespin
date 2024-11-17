import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EscapeRoomSystem system = new EscapeRoomSystem();

        // Adding rooms
        system.addRoom(new Room(1, "Mystery Room", 5));
        system.addRoom(new Room(2, "Horror Escape", 6));

        // Adding customers
        system.addCustomer(new Customer("Nate", "nate@gmail.com"));
        system.addCustomer(new Customer("Tony", "tony@gmail.com"));

        // Display available rooms
        System.out.println("Available Rooms:");
        system.displayRooms();

        // Booking a room
        System.out.println("\nBooking Room:");
        system.bookRoom("nate@gmail.com", 1, LocalDateTime.now().plusDays(1));

        // Display bookings
        System.out.println("\nCurrent Bookings:");
        system.displayBookings();

        // Display available rooms after booking
        System.out.println("\nAvailable Rooms After Booking:");
        system.displayRooms();
    }
}