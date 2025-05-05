package src;

import java.util.UUID;

public class Notification {
    private UUID id;
    private String message;
    private String type;
    private boolean read;
    private UUID userID;

    public UUID getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public boolean isRead() {
        return read;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}