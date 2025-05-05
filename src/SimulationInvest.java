package src;

import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.UUID;



public class SimulationInvest {
    private UUID id;
    private JSONObject parameters;
    private JSONObject result;
    private UUID userID;
    private LocalDateTime date;

    public UUID getId() {
        return id;
    }

    public JSONObject getParameters() {
        return parameters;
    }

    public JSONObject getResult() {
        return result;
    }

    public UUID getUserID() {
        return userID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setParameters(JSONObject parameters) {
        this.parameters = parameters;
    }

    public void setResult(JSONObject result) {
        this.result = result;
    }
}