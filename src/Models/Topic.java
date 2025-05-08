package src.Models;

import java.util.Date;
import java.util.UUID;

public class Topic {
    private UUID id;
    private UUID userId;
    private UUID categoryId;
    private String title;
    private Date createdAt;

    public Topic(UUID id, UUID userId, UUID categoryId, String title, Date createdAt) {
        this.id = id;
        this.userId = userId;
        this.categoryId = categoryId;
        this.title = title;
        this.createdAt = createdAt;
    }
}
