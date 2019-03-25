package hr.brewer.controllers;

import hr.brewer.models.GrainDropdown;
import hr.brewer.services.GrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrainController {

    private GrainService grainService;

    @Autowired
    public GrainController(GrainService grainService) {
        this.grainService = grainService;
    }

    @GetMapping("/grains")
    public List<GrainDropdown> loadAllGrains() {
        return this.grainService.loadAllGrains();
    }
}
