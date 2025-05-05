package src;

import java.util.UUID;

public class Tutorial {
    private UUID id;
    private String title;
    private String context;
    private String level;

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public String getLevel() {
        return level;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}