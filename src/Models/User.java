package src.Models;

import java.util.Date;
import java.util.UUID;


public class User {
    private UUID id;
    private String name;
    private String email;
    private Boolean mfaActive;
    private String passwordHash;
    private Date registrationDate;

    //---



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getMfaActive() {
        return mfaActive;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMfaActive(Boolean mfaActive) {
        this.mfaActive = mfaActive;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void authenticate(){
        //Método para autenticação de dois fatores
    }
    public void activateMFA(){
        this.mfaActive = true;
    }

}