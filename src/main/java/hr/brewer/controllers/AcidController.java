package hr.brewer.controllers;

import hr.brewer.models.Acid;
import hr.brewer.services.AcidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AcidController {

    private AcidService acidService;

    @Autowired
    public AcidController(AcidService acidService) {
        this.acidService = acidService;
    }

    @GetMapping("acid")
    private Iterable<Acid> fetchAllAcids() {
        return this.acidService.fetchAllAcids();
    }

}
