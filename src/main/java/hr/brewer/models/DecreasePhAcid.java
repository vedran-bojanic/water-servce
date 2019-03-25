package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class DecreasePhAcid {

    @Id
    @GeneratedValue
    private Long waterId;
    private BigDecimal lacticAcid;
    private BigDecimal acidulatedMalt;

}
