package src.Models;

import java.math.BigDecimal;
import java.util.UUID;

public class Cripto {
    private UUID id;
    private String name;
    private String acronym;
    private BigDecimal presentValue;

    public Cripto(UUID id, String name, String acronym, BigDecimal presentValue) {
        this.id = id;
        this.name = name;
        this.acronym = acronym;
        this.presentValue = presentValue;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }

    public BigDecimal getPresentValue() {
        return presentValue;
    }
}
