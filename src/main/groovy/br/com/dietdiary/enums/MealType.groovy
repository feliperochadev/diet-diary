package br.com.dietdiary.enums

import com.fasterxml.jackson.annotation.JsonValue

enum MealType implements Serializable {
    BREAKFAST("Breakfast"),
    SNACK("Snack"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SUPPER("Supper")

    private String name

    private MealType(final String name) {
        this.name = name;
    }

    @JsonValue
     String getName() {
        return name;
    }

}