package br.com.quattys.backend.infrastructure.repository;

import br.com.quattys.backend.domain.model.Diet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<Diet, Long> {
}