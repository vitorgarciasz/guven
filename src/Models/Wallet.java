package src.Models;

import java.math.BigDecimal;
import java.util.UUID;

public class Wallet {
    private UUID id;
    private UUID userId;
    private UUID cryptoId;
    private BigDecimal balance;

    public Wallet(UUID id, UUID userId, UUID cryptoId, BigDecimal balance) {
        this.id = id;
        this.userId = userId;
        this.cryptoId = cryptoId;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getCryptoId() {
        return cryptoId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
