import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EscapeRoomSystem system = new EscapeRoomSystem();

        //using builder design pattern for rooms
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

        system.addRoom(room1);
        system.addRoom(room2);
        system.addRoom(room3);

        // Adding customers
        system.registerCustomer("Nate", "1234567890", "natedog@gmail.com", "password12345");
        system.registerCustomer("John", "0987654321", "jon.com", "passwor12231d");
        system.registerCustomer("Jash", "0987654321", "jash.com", "password12231"); 



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