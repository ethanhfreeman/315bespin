import java.util.ArrayList;

public class Room {
    private int id;
    private int difficulty;
    private int maxParticipants;
    private ArrayList<String> hints = new ArrayList<>();

    public Room(int id, int difficulty, int maxParticipants) {
        this.id = id;
        this.difficulty = difficulty;
        this.maxParticipants = maxParticipants;
    }

    public int getId() {
        return id;
    }
    public int getMaxParticipants() {
        return maxParticipants;
    }

    @Override
    public String toString() {
        return "Room{id=" + id + ", difficulty=" + difficulty + ", maxParticipants=" + maxParticipants + "}";
    }
}
