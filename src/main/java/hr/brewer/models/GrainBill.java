package hr.brewer.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public @Data class GrainBill {

    @Id
    private Integer id;
    private ArrayList<Grain> grains;
    private Integer mashThickness;
    private Integer totalGrainWeight;

}
