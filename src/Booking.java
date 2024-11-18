import java.time.LocalDateTime;

public class Booking {
    private String name; 
    private int roomID;
    private int numParticipants;
    private LocalDateTime timeSlot;

    public Booking(String name, int roomID, int numParticipants, LocalDateTime timeSlot) {
        this.name = name;
        this.roomID = roomID;
        this.numParticipants = numParticipants;
        this.timeSlot = timeSlot;
    }

    public String getName() {
        return name;
    }

    public int getRoomID() {
        return roomID;
    }

    public int getNumParticipants() {
        return numParticipants;
    }

    public LocalDateTime getTimeSlot() {
        return timeSlot;
    }

}
