package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class Mineral {

    @Id
    private Integer id;
    private String name;
    private BigDecimal quantity;
    private String range;

}
