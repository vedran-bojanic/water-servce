package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class Water {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String bjcpStyleId;

    @OneToOne
    @JoinColumn(name = "id")
    private WaterReport waterReport;

    @OneToOne
    @JoinColumn(name = "id")
    private GrainBill grainBill;

    @OneToOne
    @JoinColumn(name = "id")
    private WaterAdjustment waterAdjustment;

}
