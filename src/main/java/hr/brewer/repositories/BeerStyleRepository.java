package hr.brewer.repositories;

import hr.brewer.models.BeerStyle;
import org.springframework.data.repository.CrudRepository;

public interface BeerStyleRepository extends CrudRepository<BeerStyle, Integer> { }
