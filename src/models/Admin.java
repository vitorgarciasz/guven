package src.models;

import java.util.Date;
import java.util.UUID;

public class Admin extends User {
    private UUID id;
    private String name;
    private String email;
    private String hashPassword;
    private boolean mfaActive;
    private Date registrationDate;
    /*---*/
    private double position;
    private String salary;

    public Admin(UUID id, String name, String email, String hashPassword, boolean mfaActive, Date registrationDate, double position, String salary) {
        super(id, name, email, hashPassword, registrationDate);
        this.mfaActive = mfaActive;
        this.position = position;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public boolean isMfaActive() {
        return mfaActive;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
