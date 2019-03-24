package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public @Data class DecreasePhAcid {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer lacticAcid;
    private Integer acidulatedMalt;

}
