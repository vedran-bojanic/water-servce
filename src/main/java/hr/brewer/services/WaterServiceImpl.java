package hr.brewer.services;

import hr.brewer.exceptions.WaterNotFoundException;
import hr.brewer.models.Water;
import hr.brewer.repositories.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WaterServiceImpl implements WaterService {

    private WaterRepository waterRepository;

    @Autowired
    public WaterServiceImpl(WaterRepository waterRepository) {
        this.waterRepository = waterRepository;
    }

    @Override
    public List<Water> loadSavedWaters() {
        return this.waterRepository.findAll();
    }

    @Override
    public Water loadWaterById(Long id) {
        return this.waterRepository.findById(id)
                .orElseThrow(() -> new WaterNotFoundException(id));
    }

    @Override
    public void insertWater(Water water) {
        this.waterRepository.save(water);
    }

    @Override
    public void deleteWater(Long id) {
        this.waterRepository.deleteById(id);
    }
}
