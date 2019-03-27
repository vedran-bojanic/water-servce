package hr.brewer.models;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data class WaterAdjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private DecreasePhSalts decreasePhSaltsMash;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private DecreasePhSalts decreasePhSaltsSparge;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private DecreasePhAcid decreasePhAcid;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private IncreasePhSalts increasePhSaltsMash;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(unique = true)
    private IncreasePhSalts increasePhSaltsSparge;

}
