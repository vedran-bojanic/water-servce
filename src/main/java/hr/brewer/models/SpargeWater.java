package hr.brewer.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class SpargeWater {

    @Id
    private Integer id;
    private BigDecimal pH;
    private BigDecimal volume;
    private BigDecimal acidAddition;

}
