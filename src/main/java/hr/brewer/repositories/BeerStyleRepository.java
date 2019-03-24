package hr.brewer.repositories;

import hr.brewer.models.BeerStyle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerStyleRepository extends JpaRepository<BeerStyle, Integer> { }
