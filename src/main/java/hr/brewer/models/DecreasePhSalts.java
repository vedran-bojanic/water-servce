package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class DecreasePhSalts {

    @Id
    @GeneratedValue
    private Long waterId;
    private BigDecimal epsomSalt;
    private BigDecimal calciumChloride;
    private BigDecimal gypsum;
    private boolean showGypsum;
    private boolean showCalciumChloride;
    private boolean showEpsomSalt;

}
