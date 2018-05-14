package hr.brewer.services;

import hr.brewer.models.Acid;
import hr.brewer.repositories.AcidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcidServiceImpl implements AcidService {

    private AcidRepository acidRepository;

    @Autowired
    public AcidServiceImpl(AcidRepository acidRepository) {
        this.acidRepository = acidRepository;
    }

    @Override
    public Iterable<Acid> fetchAllAcids() {
        return this.acidRepository.findAll();
    }

}
