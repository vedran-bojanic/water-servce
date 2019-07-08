package hr.brewer.controllers;

import hr.brewer.models.Water;
import hr.brewer.services.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WaterController {

    private WaterService waterService;

    @Autowired
    public WaterController(WaterService waterService) {
        this.waterService = waterService;
    }

    @GetMapping("/waters/{id}")
    public Water loadWaterById(@PathVariable Long id) {
        return this.waterService.loadWaterById(id);
    }

    @GetMapping("/water/users/{id}")
    public List<Water> loadAllWatersForUser(@PathVariable Long id) {
        return this.waterService.loadAllWatersForUser(id);
    }

    @PutMapping("/waters/{id}")
    Water editWater(@RequestBody Water water, @PathVariable Long id) {
        return this.waterService.editWater(water, id);
    }

    @DeleteMapping("/waters/{id}")
    void deleteWater(@PathVariable Long id) {
        this.waterService.deleteWater(id);
    }

    @GetMapping("/waters")
    public List<Water> loadAllWaters() {
        return this.waterService.loadAllWaters();
    }

    @PostMapping("/waters")
    public void insertWater(@RequestBody Water water) {
        this.waterService.saveWater(water);
    }

    @DeleteMapping("/waters")
    void deleteAllWaters() {
        this.waterService.deleteAllWaters();
    }

}
