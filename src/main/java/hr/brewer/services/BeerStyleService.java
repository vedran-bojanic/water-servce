package hr.brewer.services;

import hr.brewer.models.BeerStyle;

public interface BeerStyleService {

    Iterable<BeerStyle> fetchAllStyleWater();

}
