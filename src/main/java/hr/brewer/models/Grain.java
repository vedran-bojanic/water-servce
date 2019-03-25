package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public @Data class Grain {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer id;
    private String name;
    private BigDecimal weight;
    private BigDecimal color;
    @OneToOne
    private GrainDropdown grainDropdown;
    private BigDecimal crystalPh;
}
