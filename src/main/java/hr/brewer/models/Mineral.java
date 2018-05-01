package hr.brewer.models;

import lombok.Data;

import java.math.BigDecimal;

public @Data class Mineral {

    private int id;
    private String name;
    private BigDecimal quantity;
    private String range;

}
