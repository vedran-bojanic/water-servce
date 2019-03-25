package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public @Data class Grain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal weight;

    private BigDecimal color;

    @Column(name = "grainDropdownId")
    private Integer grainDropdownId;

    @OneToOne
    @JoinColumn(name = "grainDropdownId", insertable=false, updatable=false)
    private GrainDropdown grainDropdown;

    private BigDecimal crystalPh;
}
