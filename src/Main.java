import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // EscapeRoomSystem initialization
        EscapeRoomSystem system = new EscapeRoomSystem();

        // Get the Singleton instance of EmployeeManager
        EmployeeManager employeeManager = EmployeeManager.getInstance();

        // Configure the manager using EmployeeManager
        Manager manager = new Manager("Joel Deker", "jdeker", "securepassword");
        employeeManager.addEmployee(manager);

        // Using builder design pattern to create rooms
        Room room1 = new RoomBuilder(1, 5, 5)
                .addHint("Hint: LOOK UP")
                .addHint("Hint: LOOK DOWN")
                .addHint("Hint: LOOK AROUND")
                .build();

        Room room2 = new RoomBuilder(2, 6, 4)
                .addHint("Hint: REMEMBER TO BREATHE")
                .addHint("Hint: DON'T PANIC")
                .addHint("Hint: STAY CALM")
                .build();

        Room room3 = new RoomBuilder(3, 4, 3)
                .addHint("Hint: THEY'RE WATCHING YOU")
                .addHint("Hint: YOU'RE NOT ALONE")
                .addHint("Hint: RUN")
                .build();

        // Add rooms to the system
        system.addRoom(room1);
        system.addRoom(room2);
        system.addRoom(room3);

        // Register customers
        system.registerCustomer("Nate", "1234567890", "natedog@gmail.com", "password12345");
        system.registerCustomer("John", "0987654321", "jon@gmail.com", "password12231");
        system.registerCustomer("Jash", "0987654432", "jash@gmail.com", "password12236");

        // Get the Singleton instance of BookingManager
        BookingManager bookingManager = BookingManager.getInstance();

        // Display available rooms
        System.out.println("Available Rooms:");
        system.displayRooms();

        // Reserve rooms using BookingManager
        System.out.println("\nBooking Room:");
        bookingManager.createBooking(
                system.PlayerList.getID("natedog@gmail.com"),
                LocalDateTime.now(),
                1,
                5
        );

        bookingManager.createBooking(
                system.PlayerList.getID("jon@gmail.com"),
                LocalDateTime.now(),
                2,
                6
        );

        bookingManager.createBooking(
                system.PlayerList.getID("jash@gmail.com"),
                LocalDateTime.now(),
                3,
                4
        );

        // Display all current bookings
        System.out.println("\nCurrent Bookings:");
        bookingManager.displayBookings();

        // Display available rooms after booking
        System.out.println("\nAvailable Rooms After Booking:");
        system.displayRooms();
    }
}
