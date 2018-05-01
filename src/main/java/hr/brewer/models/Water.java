package hr.brewer.models;

import lombok.Data;

import java.math.BigDecimal;


public @Data class Water {

    private int id;
    private String styleId;
    private String name;

    private Mineral calcium;
    private Mineral magnesium;
    private Mineral alkalinity;
    private Mineral sulfate;
    private Mineral chloride;
    private Mineral sodium;
    private int pH;
    private String color;

    private BigDecimal targetRA;
    private BigDecimal mashWaterVolume;
    private BigDecimal dilutionRate;

    private Salt gypsum;
    private Salt calciumChloride;
    private Salt epsomSalt;
    private Salt calciumHydroxide;
    private Salt bakingSoda;
    private Salt canningSalt;
    private Salt acidAddition;

    public Water() {
        this.calcium = new Mineral();
        this.magnesium = new Mineral();
        this.alkalinity = new Mineral();
        this.sulfate = new Mineral();
        this.chloride = new Mineral();
        this.sodium = new Mineral();
    }
}
