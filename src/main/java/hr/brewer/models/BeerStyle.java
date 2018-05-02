package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class BeerStyle {

    @Id
    private Integer id;
    private String bjcpStyleId;
    private String name;
    private String ppmRange;

}
