package br.com.quattys.backend.domain.model;

import br.com.quattys.backend.domain.model.enums.MealType;
import br.com.quattys.backend.domain.model.key.MealCompositeKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meal")
@EntityListeners(AuditingEntityListener.class)
public class Meal {

    @EmbeddedId
    @Column(unique = true, nullable = false)
    private MealCompositeKey mealCompositeKey;

    @MapsId("dietId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diet_id", updatable = false, nullable = false, referencedColumnName = "id")
    private Diet diet;

    @MapsId("foodId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id", updatable = false, nullable = false, referencedColumnName = "id")
    private Food food;


    @Enumerated(EnumType.STRING)
    private MealType mealType;
    private LocalTime mealTime;
    private Integer calories;
    private String quantity;
    private String consumptionInstruction;
    private Integer order; // 0 indica principal e após isso seria as reservas

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;


}