package hr.brewer.services;

import hr.brewer.models.Water;

import java.util.List;

public interface WaterService {

    List<Water> fetchAllStyleWater();

    List<Water> loadSavedWaters();

    void insertWater(int id, Water water);

}
