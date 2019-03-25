package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public @Data class WaterReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal calcium;
    private BigDecimal magnesium;
    private BigDecimal sodium;
    private BigDecimal chloride;
    private BigDecimal sulfate;
    private BigDecimal alkalinity;
    private BigDecimal mashVolume;
    private BigDecimal spargeVolume;
    private BigDecimal mashRoPercentage;
    private BigDecimal spargeRoPercentage;

}
