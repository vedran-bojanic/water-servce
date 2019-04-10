package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
public @Data class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
