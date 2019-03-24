package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public @Data class DecreasePhSalts {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer epsomSalt;
    private Integer calciumChloride;
    private Integer gypsum;
    private boolean showGypsum;
    private boolean showCalciumChloride;
    private boolean showEpsomSalt;

}
