package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class DecreasePhAcid {

    @Id
    private Long id;
    private Integer lacticAcid;
    private Integer acidulatedMalt;

}
