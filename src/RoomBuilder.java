import java.util.ArrayList;
import java.util.List;

public class RoomBuilder {
    final int id;
    protected final int difficulty;
    protected final int maxParticipants;
    public List<String> hints = new ArrayList<>();

    // Constructor for required fields
    public RoomBuilder(int id, int difficulty, int maxParticipants) {
        this.id = id;
        this.difficulty = difficulty;
        this.maxParticipants = maxParticipants;
    }

    // Setter for optional hints field
    public RoomBuilder addHint(String hint) {
        this.hints.add(hint);
        return this;
    }

    public RoomBuilder addHints(List<String> hints) {
        this.hints.addAll(hints);
        return this;
    }

    // Build method to create a Room instance
    public Room build() {
        return new Room(this);
    }
}