import java.util.Date;
import java.util.UUID;


public class User {
    private UUID id;
    private String name;
    private String email;
    private Boolean mfaActive;
    private String senhaHash;
    private Date registrationDate;

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

    public String getSenhaHash() {
        return senhaHash;
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

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public void authenticate(){
        //Método para autenticação de dois fatores
    }
    public void activateMFA(){
        this.mfaActive = true;
    }
}
