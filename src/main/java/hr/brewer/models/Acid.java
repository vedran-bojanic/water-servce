package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class Acid {

    @Id
    private Integer id;
    private String name;
    private BigDecimal normality;
    private BigDecimal anionPermEq;

}
