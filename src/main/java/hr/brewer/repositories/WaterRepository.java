package hr.brewer.repositories;

import hr.brewer.models.Water;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterRepository extends JpaRepository<Water, Long> { }
