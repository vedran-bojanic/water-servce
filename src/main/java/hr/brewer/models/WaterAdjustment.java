package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public @Data class WaterAdjustment {

    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "id")
    private DecreasePhSalts decreasePhSaltsMash;
    @OneToOne
    @JoinColumn(name = "id")
    private DecreasePhSalts decreasePhSaltsSparge;
    @OneToOne
    @JoinColumn(name = "id")
    private DecreasePhAcid decreasePhAcid;
    @OneToOne
    @JoinColumn(name = "id")
    private IncreasePhSalts increasePhSaltsMash;
    @OneToOne
    @JoinColumn(name = "id")
    private IncreasePhSalts increasePhSaltsSparge;

}
