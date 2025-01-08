package br.com.quattys.backend.domain.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MealCompositeKey {

    @Column(name = "diet_id")
    private Long dietId;

    @Column(name = "food_id")
    private Long foodId;
}
