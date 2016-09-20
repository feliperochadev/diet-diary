package br.com.dietdiary.repositories

import br.com.dietdiary.domains.Meal

import java.util.List

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "meal", path = "meals")
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {

}








