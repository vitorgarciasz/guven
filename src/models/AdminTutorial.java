package src.models;

import java.util.Date;
import java.util.UUID;

public class AdminTutorial {
    private UUID adminId;
    private UUID tutorialId;
    private Date createdAt;
    private String status;

    public AdminTutorial(UUID adminId, UUID tutorialId, Date createdAt, String status) {
        this.adminId = adminId;
        this.tutorialId = tutorialId;
        this.createdAt = createdAt;
        this.status = status;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public UUID getTutorialId() {
        return tutorialId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }

    public void setTutorialId(UUID tutorialId) {
        this.tutorialId = tutorialId;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
