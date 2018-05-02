package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class Mineral {

    @Id
    private Integer id;
    private String calcium;
    private String magnesium;
    private String alkalinity;
    private String sulfate;
    private String chloride;
    private String sodium;
    private int pH;

}
