package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class GrainDropdown {

    @Id
    private Long id;
    private String name;
    private Integer pH;
    private Integer type;

}
