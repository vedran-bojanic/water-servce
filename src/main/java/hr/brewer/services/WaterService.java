package hr.brewer.services;

import hr.brewer.models.Water;

import java.util.Optional;

public interface WaterService {

    Iterable<Water> loadSavedWaters();

    Optional<Water> loadWaterById(Integer id);

    void insertWater(Integer id, Water water);

}
