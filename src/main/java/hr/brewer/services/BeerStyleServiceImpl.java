package hr.brewer.services;

import hr.brewer.models.BeerStyle;
import hr.brewer.repositories.BeerStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerStyleServiceImpl implements BeerStyleService {

    private BeerStyleRepository beerStyleRepository;

    @Autowired
    public BeerStyleServiceImpl(BeerStyleRepository beerStyleRepository) {
        this.beerStyleRepository = beerStyleRepository;
    }

    @Override
    public List<BeerStyle> fetchBeerStyleWaters() {
        return this.beerStyleRepository.findAll();
    }

}
