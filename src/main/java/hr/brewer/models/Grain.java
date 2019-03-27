package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public @Data class Grain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long grainPosition;

    private String name;

    private BigDecimal weight;

    private BigDecimal color;

    @Column(name = "grainTypeId")
    private Integer grainTypeId;

    @OneToOne
    @JoinColumn(name = "grainTypeId", insertable=false, updatable=false)
    private GrainType grainType;

    private BigDecimal crystalPh;
}
