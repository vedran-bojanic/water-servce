package hr.brewer.services;

import hr.brewer.models.GrainType;

import java.util.List;

public interface GrainService {

    List<GrainType> loadAllGrains();

}
