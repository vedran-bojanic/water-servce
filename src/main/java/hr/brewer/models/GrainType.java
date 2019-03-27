package hr.brewer.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class GrainType {

    @Id
    private Long id;
    private String name;
    private BigDecimal pH;
    private Integer maltType;

    @JsonProperty("pH")
    public BigDecimal getpH() {
        return pH;
    }
}
