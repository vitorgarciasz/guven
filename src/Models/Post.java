package src.Models;

import java.util.Date;
import java.util.UUID;

public class Post {
    private UUID id;
    private UUID authorId;
    private UUID topicId;
    private UUID categoryId;
    private String content;
    private Date postDate;

    public Post(UUID id, UUID authorId, UUID topicId, UUID categoryId, String content, Date postDate) {
        this.id = id;
        this.authorId = authorId;
        this.topicId = topicId;
        this.categoryId = categoryId;
        this.content = content;
        this.postDate = postDate;
    }

    public UUID getId() {
        return id;
    }

    public UUID getAuthorId() {
        return authorId;
    }

    public UUID getTopicId() {
        return topicId;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getContent() {
        return content;
    }

    public Date getPostDate() {
        return postDate;
    }
}
