package src.models;

import java.util.Date;
import java.util.UUID;

public class CommomUser extends User {

    public CommomUser(UUID id, String name, String email, String passwordHash, Date registrationDate) {
        super(id, name, email, passwordHash, registrationDate);
    }

}
