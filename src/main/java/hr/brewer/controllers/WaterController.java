package hr.brewer.controllers;

import hr.brewer.models.BeerStyle;
import hr.brewer.models.Water;
import hr.brewer.services.BeerStyleService;
import hr.brewer.services.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class WaterController {

    private WaterService waterService;
    private BeerStyleService beerStyleService;

    @Autowired
    public WaterController(WaterService waterService, BeerStyleService beerStyleService) {
        this.waterService = waterService;
        this.beerStyleService = beerStyleService;
    }

    @GetMapping("beerStyle")
    public Iterable<BeerStyle> fetchAllStyleWater() {
        return this.beerStyleService.fetchAllStyleWater();
    }

    @GetMapping("water")
    public Iterable<Water> loadSavedWaters() {
        return this.waterService.loadSavedWaters();
    }

    @GetMapping("water/{id}")
    public Optional<Water> loadWaterById(@PathVariable Integer id) {
        return this.waterService.loadWaterById(id);
    }

    @PostMapping("water/{id}")
    public void insertWater(@PathVariable Integer id, Water water) {
        this.waterService.insertWater(id, water);
    }

}
