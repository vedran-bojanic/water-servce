package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class WaterReport {

    @Id
    private Integer id;
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
