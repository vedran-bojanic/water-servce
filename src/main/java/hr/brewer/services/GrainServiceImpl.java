package hr.brewer.services;

import hr.brewer.models.GrainDropdown;
import hr.brewer.repositories.GrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GrainServiceImpl implements GrainService {

    private GrainRepository grainRepository;

    @Autowired
    public GrainServiceImpl(GrainRepository grainRepository) {
        this.grainRepository = grainRepository;
    }

    @Override
    public List<GrainDropdown> loadAllGrains() {
        return this.grainRepository.findAll();
    }
}
