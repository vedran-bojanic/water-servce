package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class WaterAdjustment {

    @Id
    @GeneratedValue
    private Long waterId;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private DecreasePhSalts decreasePhSaltsMash;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private DecreasePhSalts decreasePhSaltsSparge;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private DecreasePhAcid decreasePhAcid;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private IncreasePhSalts increasePhSaltsMash;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "waterId")
    private IncreasePhSalts increasePhSaltsSparge;

}
