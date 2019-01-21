package chapter4.PizzaType;

import chapter4.PizzaIngredients.PizzaIngredientFactory;
import chapter4.PizzaType.Pizza;

public class CaliforniaStylePepperoni extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CaliforniaStylePepperoni(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
