package src;

import java.time.LocalDateTime;
import java.util.UUID;
import org.json.JSONObject;

public class AnalysysInvest {
    private UUID id;
    private JSONObject analysisType;
    private String content;
    private LocalDateTime date;
    private UUID userID;

    public UUID getId() {
        return id;
    }

    public JSONObject getAnalysisType() {
        return analysisType;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setAnalysisType(JSONObject analysisType) {
        this.analysisType = analysisType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}