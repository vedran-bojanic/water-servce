package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public @Data class IncreasePhSalts {

    @Id
    @GeneratedValue
    private Long waterId;
    private Integer slakedLime;
    private Integer bakingSoda;
    private Integer chalk;
    private boolean showSlakedLime;
    private boolean showBakingSoda;
    private boolean showChalk;

}
