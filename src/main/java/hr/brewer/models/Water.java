package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class Water {

    @Id
    @Column(name="waterId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "beerStyleId", nullable=false)
    private Integer beerStyleId;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private WaterReport waterReport;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private GrainBill grainBill;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private WaterAdjustment waterAdjustment;

    @OneToOne(cascade=CascadeType.ALL)
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
