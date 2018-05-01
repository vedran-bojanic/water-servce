package hr.brewer.controllers;


import hr.brewer.models.Water;
import hr.brewer.services.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class WaterController {

    WaterService waterService;

    @Autowired
    public WaterController(WaterService waterService) {
        this.waterService = waterService;
    }

    @GetMapping("defaultWater")
    public List<Water> fetchAllStyleWater() {
        return this.waterService.fetchAllStyleWater();
    }

    @GetMapping("water")
    public List<Water> loadSavedWaters() {
        return this.waterService.loadSavedWaters();
    }

    @PostMapping("water/{id}")
    public void insertWater(@PathVariable int id, Water water) {
        this.waterService.insertWater(id, water);
    }
}
