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

}
