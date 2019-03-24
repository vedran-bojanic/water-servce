package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class DecreasePhSalts {

    @Id
    private Long id;
    private Integer epsomSalt;
    private Integer calciumChloride;
    private Integer gypsum;
    private Integer showGypsum;
    private Integer showCalciumChloride;
    private Integer showEpsomSalt;

}
