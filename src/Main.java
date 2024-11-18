import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EscapeRoomSystem system = new EscapeRoomSystem();

        // Adding rooms
        system.addRoom(new Room(1, 3, 5));
        system.addRoom(new Room(2, 4, 6));
        system.addRoom(new Room(3, 2, 4));
        system.addRoom(new Room(4, 5, 8));

        // Adding customers
        system.registerCustomer("Nate", "1234567890", "natedog@gmail.com", "password");
        system.registerCustomer("John", "0987654321", "jon.com", "password");
        system.registerCustomer("Jash", "0987654321", "jash.com", "password"); 



        // Display available rooms
        System.out.println("Available Rooms:");
        system.displayRooms();

        // Booking a room
        System.out.println("\nBooking Room:");
        // Reserve a room
        system.reserveRoom(system.PlayerList.getID("natedog@gmail.com"), LocalDateTime.now(), 1, 5);
        system.reserveRoom(system.PlayerList.getID("jon.com"), LocalDateTime.now(), 2, 6);
        system.reserveRoom(system.PlayerList.getID("jash.com"), LocalDateTime.now(), 3, 4);
        

        // Display bookings
        System.out.println("\nCurrent Bookings:");
        system.displayBookings();

        // Display available rooms after booking
        System.out.println("\nAvailable Rooms After Booking:");
        system.displayRooms();
    }
}