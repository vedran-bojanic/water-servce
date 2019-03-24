package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class IncreasePhSalts {

    @Id
    private Long id;
    private Integer slakedLime;
    private Integer bakingSoda;
    private Integer chalk;
    private Integer showSlakedLime;
    private Integer showBakingSoda;
    private Integer showChalk;

}
