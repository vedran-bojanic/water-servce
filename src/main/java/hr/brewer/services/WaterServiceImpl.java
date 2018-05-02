package hr.brewer.services;

import hr.brewer.models.Water;
import hr.brewer.repositories.BeerStyleRepository;
import hr.brewer.repositories.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WaterServiceImpl implements WaterService {

    private WaterRepository waterRepository;
    private BeerStyleRepository beerStyleRepository;

    @Autowired
    public WaterServiceImpl(WaterRepository waterRepository, BeerStyleRepository beerStyleRepository) {
        this.waterRepository = waterRepository;
        this.beerStyleRepository = beerStyleRepository;
    }

    @Override
    public Iterable<Water> loadSavedWaters() {
        return this.waterRepository.findAll();
    }

    @Override
    public Optional<Water> loadWaterById(Integer id) {
        return this.waterRepository.findById(id);
    }

    @Override
    public void insertWater(Integer id, Water water) {

    }

}
