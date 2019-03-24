package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class Water {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "beerStyleId", nullable=false)
    private Integer beerStyleId;
    private String name;

    @OneToOne
    @JoinColumn(name = "id")
    private WaterReport waterReport;

    @OneToOne
    @JoinColumn(name = "id")
    private GrainBill grainBill;

    @OneToOne
    @JoinColumn(name = "id")
    private WaterAdjustment waterAdjustment;

    @OneToOne
    @JoinColumn(name = "beerStyleId", insertable=false, updatable=false)
    private BeerStyle beerStyle;

    public Water() { }

    public Water(Integer beerStyleId, String name, WaterReport waterReport, GrainBill grainBill, WaterAdjustment waterAdjustment, BeerStyle beerStyle) {
        this.beerStyleId = beerStyleId;
        this.name = name;
        this.waterReport = waterReport;
        this.grainBill = grainBill;
        this.waterAdjustment = waterAdjustment;
        this.beerStyle = beerStyle;
    }
}
