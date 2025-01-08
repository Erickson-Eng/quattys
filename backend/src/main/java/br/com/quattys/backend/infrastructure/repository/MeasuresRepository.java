package br.com.quattys.backend.infrastructure.repository;

import br.com.quattys.backend.domain.model.Measures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasuresRepository extends JpaRepository<Measures, Long> {
}