package hr.brewer.services;

import hr.brewer.models.Water;

import java.util.List;

public interface WaterService {

    List<Water> loadSavedWaters();

    Water loadWaterById(Long id);

    void insertWater(Water water);

    void deleteWater(Long id);

}
