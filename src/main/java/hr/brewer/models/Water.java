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

    @OneToOne
    @JoinColumn(name = "id")
    private Mineral calcium;
    @OneToOne
    @JoinColumn(name = "id")
    private Mineral magnesium;
    @OneToOne
    @JoinColumn(name = "id")
    private Mineral alkalinity;
    @OneToOne
    @JoinColumn(name = "id")
    private Mineral sulfate;
    @OneToOne
    @JoinColumn(name = "id")
    private Mineral chloride;
    @OneToOne
    @JoinColumn(name = "id")
    private Mineral sodium;
    private int pH;
    private String color;

    private BigDecimal targetRA;
    private BigDecimal mashWaterVolume;
    private BigDecimal dilutionRate;

    @OneToOne
    @JoinColumn(name = "id")
    private Salt gypsum;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt calciumChloride;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt epsomSalt;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt calciumHydroxide;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt bakingSoda;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt canningSalt;
    @OneToOne
    @JoinColumn(name = "id")
    private Salt acidAddition;

}
