package src.Models;

import java.util.UUID;

public class Answer {
    private UUID id;
    private UUID userId;
    private UUID postId;
    private String content;

    public Answer(UUID id, UUID userId, UUID postId, String content) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }
}
