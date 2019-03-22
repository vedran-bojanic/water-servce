package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class DecreasePhAcid {

    @Id
    private Integer id;
    private Integer decreasePhAcid;
    private Integer acidulatedMalt;

}
