package src.models;

import java.util.Date;
import java.util.UUID;

public class Tutorial {
    private UUID id;
    private UUID adminId;
    private Date createdAt;
    private String title;
    private String content;
    private String image; //Colocar o url da imagem como string e puxar no front ou outra opção
    //Criar entidade associativa para Admin

    public Tutorial( UUID id,
     UUID adminId,
     Date createdAt,
     String title,
     String content,
     String image) {
        this.id = id;
        this.adminId = adminId;
        this.createdAt = createdAt;
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public UUID getId() {
        return id;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }
}
