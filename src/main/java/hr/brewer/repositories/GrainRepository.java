package hr.brewer.repositories;

import hr.brewer.models.GrainDropdown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrainRepository extends JpaRepository<GrainDropdown, Long> { }
