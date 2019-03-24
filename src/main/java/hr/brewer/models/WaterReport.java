package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public @Data class WaterReport {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer calcium;
    private Integer magnesium;
    private Integer sodium;
    private Integer chloride;
    private Integer sulfate;
    private Integer alkalinity;
    private Integer mashVolume;
    private Integer spargeVolume;
    private Integer mashRoPercentage;
    private Integer spargeRoPercentage;

}
