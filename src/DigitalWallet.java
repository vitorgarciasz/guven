package src;

import java.math.BigDecimal;
import java.util.UUID;

public class DigitalWallet {
    private UUID id;
    private BigDecimal balance;
    private UUID userId;

    public UUID getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void calculateBalance() {
        //Método para calcular o saldo
    }
}

