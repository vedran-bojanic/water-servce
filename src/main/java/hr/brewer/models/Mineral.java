package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class Mineral {

    @Id
    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private MineralName name;
    private BigDecimal quantity;
    private String ppmRange;

}
