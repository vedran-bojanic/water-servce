package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public @Data class Water {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String bjcpStyleId;

    @OneToOne
    @JoinColumn(name = "id")
    private Mineral sourceWaterData;

    private BigDecimal targetResidualAlkalinity;
    private BigDecimal mashWaterVolume;
    private BigDecimal dilutionRate;

    @OneToOne
    @JoinColumn(name = "id")
    private Salt saltAdditions;

    @OneToOne
    @JoinColumn(name = "id")
    private SpargeWater spargeWater;

}
