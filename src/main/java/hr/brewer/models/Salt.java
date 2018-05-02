package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class Salt {

    @Id
    private Integer id;
    private BigDecimal gypsum;
    private BigDecimal calciumChloride;
    private BigDecimal epsomSalt;
    private BigDecimal calciumHydroxide;
    private BigDecimal bakingSoda;
    private BigDecimal canningSalt;
    private BigDecimal acidAddition;

}
