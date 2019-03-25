package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public @Data class GrainBill {

    @Id
    @GeneratedValue
    private Long waterId;
    @OneToMany(targetEntity=Grain.class, cascade=CascadeType.ALL)
    private List<Grain> grains;
    private BigDecimal mashThickness;
    private BigDecimal totalGrainWeight;

}
