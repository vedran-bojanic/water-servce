package hr.brewer.repositories;

import hr.brewer.models.GrainType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrainRepository extends JpaRepository<GrainType, Long> { }
