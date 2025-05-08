package src.Models;

import java.util.Date;
import java.util.UUID;

public class Admin {
    private UUID id;
    private String name;
    private String email;
    private String hashPassword;
    private boolean mfaActive;
    private Date registrationDate;

    public Admin(UUID id, String name, String email, String hashPassword, boolean mfaActive, Date registrationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hashPassword = hashPassword;
        this.mfaActive = mfaActive;
        this.registrationDate = registrationDate;
    }

    //Criar entidade associativa para Tutorial
}
