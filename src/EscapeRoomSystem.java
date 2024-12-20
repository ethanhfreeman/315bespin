import java.util.ArrayList;
import java.time.LocalDateTime;



public class EscapeRoomSystem {

    ArrayList<Room> rooms = new ArrayList<>();
    PlayerList PlayerList = new PlayerList();
    BookingList BookingList = new BookingList();


    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void registerCustomer(String name, String phoneNum, String email, String password) {
        if (PlayerList.phoneNuminSystem(phoneNum)) {
            System.out.println("Phone number already in use!");
            return;
        }

        if (PlayerList.emailinSystem(email)) {
            System.out.println("Email already in use!");
            return;
        }
        if (password.length() <= 12){
            System.out.println("Password is WEAK");
            return;
        }
        PlayerList.addPlayer(name, phoneNum, email, password);
        System.out.println("Customer registered successfully!");
    }

    public void reserveRoom(int CustomerID, LocalDateTime timeSlot, int roomID, int numParticipants){
        //get maximum participants of the room
        int maxParticipants = rooms.get(roomID - 1).getMaxParticipants();
        if (numParticipants > maxParticipants){
            System.out.println("Number of participants exceeds the maximum limit of the room!");
            return;

        }
        //check if the room is available for the timeSlot
        for (Booking booking : BookingList.bookings){
            if (booking.getRoomID() == roomID && booking.getTimeSlot().equals(timeSlot)){
                System.out.println("Room is already booked for the given time slot!");
                return;
            }
        }
        //check valid payment for customer
        if (PlayerList.validPayment(CustomerID)){
            System.out.println("Payment valid!");
        }
        else{
            System.out.println("Payment failed!");
            return;
        }
        //get the name of the customer from the id
        String name = PlayerList.getName(CustomerID);
        //create booking with name
        BookingList.createBooking(name, timeSlot, roomID, numParticipants);
        System.out.println("Room #"+roomID+" booked successfully for " + numParticipants + " participants, under tthe name of " + name);  
        
    
    }

    public void displayRooms() {
        rooms.forEach(System.out::println);
    }

    public void displayBookings() {
        BookingList.bookings.forEach(System.out::println);
    }
}
