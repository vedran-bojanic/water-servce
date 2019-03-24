package hr.brewer.services;

import hr.brewer.models.Water;

import java.util.List;

public interface WaterService {

    List<Water> loadAllWaters();

    Water loadWaterById(Long id);

    void saveWater(Water water);

    Water editWater(Water water, Long id);

    void deleteWater(Long id);

}
