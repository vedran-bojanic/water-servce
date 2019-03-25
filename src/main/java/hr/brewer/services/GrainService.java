package hr.brewer.services;

import hr.brewer.models.GrainDropdown;

import java.util.List;

public interface GrainService {

    List<GrainDropdown> loadAllGrains();

}
