package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public @Data class Water {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String name;

    @Column(name = "beerStyleId", nullable=false)
    private Integer beerStyleId;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private WaterReport waterReport;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "water_id")
    private List<Grain> grains;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private WaterAdjustment waterAdjustment;

    @OneToOne
    @JoinColumn(name = "beerStyleId", insertable=false, updatable=false)
    private BeerStyle beerStyle;

    public Water() { }

    public Water(Integer beerStyleId, String name) {
        this.beerStyleId = beerStyleId;
        this.name = name;
    }
}
