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
    public Water loadWaterById(Long id) {
        return this.waterRepository.findById(id)
                .orElseThrow(() -> new WaterNotFoundException(id));
    }

    @Override
    public List<Water> loadAllWatersForUser(Long id) {
        return this.waterRepository.findWatersByUserId(id);
    }

    @Override
    public Water editWater(Water newWater, Long id) {

        return this.waterRepository.findById(id)
                .map(water -> {
                    water.setName(newWater.getName());
                    water.setBeerStyleId(newWater.getBeerStyleId());
                    water.setWaterReport(newWater.getWaterReport());
                    water.setGrains(newWater.getGrains());
                    water.setWaterAdjustment(newWater.getWaterAdjustment());
                    return this.waterRepository.save(water);
                })
                .orElseGet(() -> {
                    newWater.setId(id);
                    return this.waterRepository.save(newWater);
                });
    }

    @Override
    public void deleteWater(Long id) {
        this.waterRepository.deleteById(id);
    }

    @Override
    public List<Water> loadAllWaters() {
        return this.waterRepository.findAll();
    }

    @Override
    public void saveWater(Water water) {
        this.waterRepository.save(water);
    }

    @Override
    public void deleteAllWaters() {
        this.waterRepository.deleteAll();
    }
}
