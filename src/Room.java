import java.util.ArrayList;

public class Room {
    private int id;
    private String name;
    private int maxParticipants;
    private boolean isAvailable;

    public Room(int id, String name, int maxParticipants) {
        this.id = id;
        this.name = name;
        this.maxParticipants = maxParticipants;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{id=" + id + ", name='" + name + "', maxParticipants=" + maxParticipants + ", isAvailable=" + isAvailable + "}";
    }
}
