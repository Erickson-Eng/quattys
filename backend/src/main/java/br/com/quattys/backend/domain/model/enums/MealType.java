package br.com.quattys.backend.domain.model.enums;
import lombok.Getter;

@Getter
public enum MealType {

    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SNACK("Snack"),
    SUPPER("Supper"),
    MIDNIGHT_SNACK("Midnight Snack");

    private final String mealName;

    MealType(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String toString() {
        return mealName;
    }

    public static MealType fromString(String mealName) {
        for (MealType mealType : MealType.values()) {
            if (mealType.mealName.equalsIgnoreCase(mealName)) {
                return mealType;
            }
        }
        throw new IllegalArgumentException("Invalid meal name: " + mealName);
    }
}