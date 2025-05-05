package src;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PostForum {
    private UUID id;
    private UUID authorID;
    private String content;
    private Date postDate;
    private List<String> answers;

    public UUID getId() {
        return id;
    }

    public UUID getAuthorID() {
        return authorID;
    }

    public String getContent() {
        return content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    //---------------------


}