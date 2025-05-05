package src;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class CriptoTransaction {
    private UUID id;
    private String tipo;
    private BigDecimal valor;
    private LocalDateTime data;
    private UUID ativoID;
    private UUID carteiraID;

    public UUID getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public UUID getAtivoID() {
        return ativoID;
    }

    public UUID getCarteiraID() {
        return carteiraID;
    }

    public void execute() {
        //Método de transação
    }

}