import java.util.ArrayList;
import java.util.List;

public class Room {
    private final int id; // Required
    private final int difficulty; // Required
    private final int maxParticipants; // Required
    private final List<String> hints; // Optional

    // Private constructor to enforce the use of the builder
    protected Room(RoomBuilder builder) {
        this.id = builder.id;
        this.difficulty = builder.difficulty;
        this.maxParticipants = builder.maxParticipants;
        this.hints = builder.hints;
    }

    public int getId() {
        return id;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    @Override
    public String toString() {
        return "Room{id=" + id +
                ", difficulty=" + difficulty +
                ", maxParticipants=" + maxParticipants +
                ", hints=" + hints + "}";
    }
}