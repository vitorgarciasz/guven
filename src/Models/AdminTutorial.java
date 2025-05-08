package src.Models;

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

}
