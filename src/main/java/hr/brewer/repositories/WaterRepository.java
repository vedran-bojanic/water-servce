package hr.brewer.repositories;

import hr.brewer.models.Water;
import org.springframework.data.repository.CrudRepository;

public interface WaterRepository extends CrudRepository<Water, Integer> { }
