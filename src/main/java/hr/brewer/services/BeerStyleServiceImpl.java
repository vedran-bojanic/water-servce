package hr.brewer.services;

import hr.brewer.models.BeerStyle;
import hr.brewer.repositories.BeerStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerStyleServiceImpl implements BeerStyleService {

    private BeerStyleRepository beerStyleRepository;

    @Autowired
    public BeerStyleServiceImpl(BeerStyleRepository beerStyleRepository) {
        this.beerStyleRepository = beerStyleRepository;
    }

    @Override
    public Iterable<BeerStyle> fetchBeerStyleWaters() {
        return this.beerStyleRepository.findAll();
    }

}
