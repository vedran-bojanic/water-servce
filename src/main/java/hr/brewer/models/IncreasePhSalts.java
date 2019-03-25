package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public @Data class IncreasePhSalts {

    @Id
    @GeneratedValue
    private Long waterId;
    private BigDecimal slakedLime;
    private BigDecimal bakingSoda;
    private BigDecimal chalk;
    private boolean showSlakedLime;
    private boolean showBakingSoda;
    private boolean showChalk;

}
