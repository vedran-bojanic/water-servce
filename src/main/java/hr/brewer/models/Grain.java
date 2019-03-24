package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class Grain {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer id;
    private Integer name;
    private Integer weight;
    private Integer color;
    @OneToOne
    private GrainDropdown grainDropdown;
    private Integer crystalPh;
}
