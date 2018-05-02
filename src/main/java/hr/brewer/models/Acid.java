package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public @Data class Acid {

    @Id
    private Integer id;
    private String name;

}
