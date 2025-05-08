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
}
