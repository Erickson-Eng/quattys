package br.com.quattys.backend.domain.repository;

import br.com.quattys.backend.domain.model.Meal;
import br.com.quattys.backend.domain.model.key.MealCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, MealCompositeKey> {
}