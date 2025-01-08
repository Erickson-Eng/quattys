package br.com.quattys.backend.domain.repository;

import br.com.quattys.backend.domain.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}