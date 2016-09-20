package br.com.dietdiary.domains

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    @NotNull
    String name
    @NotNull
    Double calories
    //USA Agricultural Research Service food Id
    @NotNull
    Long ndbno
}
