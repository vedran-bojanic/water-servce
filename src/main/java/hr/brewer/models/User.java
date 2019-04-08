package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
public @Data class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Transient
    private String passwordConfirm;

}
