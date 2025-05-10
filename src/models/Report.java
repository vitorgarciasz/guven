package src.models;

import java.util.Date;
import java.util.UUID;

public class Report {
    private UUID id;
    private UUID userId;
    private String content;
    private Date createdAt;

    public Report(UUID id, UUID userId, String content, Date createdAt) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
