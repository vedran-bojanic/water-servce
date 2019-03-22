package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public @Data class Grain {

    @Id
    private Integer id;
    private Integer grainId;
    private Integer name;
    private Integer weight;
    private Integer color;
    @OneToOne
    @JoinColumn(name = "id")
    private GrainDropdown grainDropdown;
    private Integer crystalPh;
}
