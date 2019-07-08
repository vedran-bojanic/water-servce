package hr.brewer.repositories;

import hr.brewer.models.Water;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WaterRepository extends JpaRepository<Water, Long> {

    List<Water> findWatersByUserId(Long id);

}
