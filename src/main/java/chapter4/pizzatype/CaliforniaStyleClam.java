package chapter4.pizzatype;

import chapter4.pizzaingredients.PizzaIngredientFactory;

public class CaliforniaStyleClam extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CaliforniaStyleClam(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

