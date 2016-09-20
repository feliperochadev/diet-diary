package br.com.dietdiary.init

import br.com.dietdiary.domains.Food
import br.com.dietdiary.domains.Meal
import br.com.dietdiary.enums.MealType
import br.com.dietdiary.repositories.MealRepository
import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class MealLoader implements ApplicationListener<ContextRefreshedEvent>  {

    private MealRepository mealRepository

    @Autowired
    public void setMealRepository(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    private def log = Logger.getLogger MealLoader.class

    @Override
    void onApplicationEvent(ContextRefreshedEvent event){
        def date = new Date()
        date.minus 2
        def meal = new Meal(date: date, meal: MealType.BREAKFAST,
                foods: [new Food(name: "Margarine-like, margarine-butter blend, soybean oil and butter", calories: 103, ndbno: "04585"),
                        new Food(name: "Bread stuffing, bread, dry mix", calories: 386, ndbno: "18081"),
                        new Food(name: "MILK MAGIC, CHOCOLATE MILK STRAWS, CHOCOLATE MILK, UPC: 803810234951", calories: 385, ndbno: "45100704")])
        mealRepository.save meal
        log.info "Saved BREAKFAST - id: " + meal.id;
        def meal2 = new Meal(date: date, meal: MealType.LUNCH,
                foods: [new Food(name: "O ORGANICS, QUICK-COOK RICE BLEND, ORGANIC BROWN BASMATI RICE, ORGANIC WHOLE GRAIN RED RICE, UPC: 079893502274", calories: 350, ndbno: "45091352"),
                        new Food(name: "Rolls, hamburger or hotdog, mixed-grain", calories: 263, ndbno: "18351"),
                        new Food(name: "Potatoes, french fried, steak fries, salt added in processing, frozen, as purchased", calories: 133, ndbno: "11411"),
                        new Food(name: "MEIJER, ORANGE JUICE, ORANGE, UPC: 041250646310", calories: 155, ndbno: "45040119")])
        mealRepository.save meal2
        log.info "Saved LUNCH - id: " + meal2.id
        def meal3 = new Meal(date: date, meal: MealType.DINNER,
                foods: [new Food(name: "O ORGANICS, QUICK-COOK RICE BLEND, ORGANIC BROWN BASMATI RICE, ORGANIC WHOLE GRAIN RED RICE, UPC: 079893502274", calories: 350, ndbno: "45091352"),
                        new Food(name: "STARKIST, SALMON CREATIONS, LIGHTLY MARINATED PREMIUM SKINLESS BONELESS SALMON, LEMON DILL, UPC: 080000516145", calories: 122, ndbno: "45110268"),
                        new Food(name: "Alcoholic beverage, wine, table, white, Semillon", calories: 82, ndbno: "14126")])
        mealRepository.save meal3
        log.info "Saved DINNER - id: " + meal3.id
        date.plus 1
        def meal4 = new Meal(date: date, meal: MealType.LUNCH,
                foods: [new Food(name: "McDONALD'S, BIG MAC", calories: 257, ndbno: "21237"),
                        new Food(name: "Beverages, The COCA-COLA company, Hi-C Flashin' Fruit Punch", calories: 45, ndbno: "14065")])
        mealRepository.save meal4
        log.info "Saved LUNCH - id: " + meal4.id
        def meal5 = new Meal(date: date, meal: MealType.SNACK,
                foods: [new Food(name: "TACO BELL, Soft Taco with steak", calories: 225, ndbno: "21263")])
        mealRepository.save meal5
        log.info "Saved SNACK - id: " + meal5.id
        date.plus 1
        def meal6 = new Meal(date: date, meal: MealType.SUPPER,
                foods: [new Food(name: "Apples, raw, without skin", calories: 48, ndbno: "09004")])
        mealRepository.save meal6
        log.info "Saved SUPPER - id: " + meal6.id
    }


}
