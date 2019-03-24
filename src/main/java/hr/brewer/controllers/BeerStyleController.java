package hr.brewer.controllers;

import hr.brewer.models.BeerStyle;
import hr.brewer.services.BeerStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeerStyleController {

    private BeerStyleService beerStyleService;

    @Autowired
    public BeerStyleController(BeerStyleService beerStyleService) {
        this.beerStyleService = beerStyleService;
    }

    @GetMapping("/beerstyles")
    public List<BeerStyle> fetchBeerStyleWaters() {
        return this.beerStyleService.fetchBeerStyleWaters();
    }
}
