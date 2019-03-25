package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

public @Data class GrainBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "grainBill", cascade = CascadeType.ALL)
    private List<Grain> grains;

}
