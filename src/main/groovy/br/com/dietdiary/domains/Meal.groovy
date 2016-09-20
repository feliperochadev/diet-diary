package br.com.dietdiary.domains

import br.com.dietdiary.enums.MealType
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.stereotype.Component

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

@Entity
class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    @NotNull
    Date date
    @NotNull
    MealType meal

    @OneToMany(cascade = CascadeType.ALL)
    //@RestResource(exported = true)
    List<Food> foods
}
