package dev.lpa.burger;

public class Store {
    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("BACON", "CHEESE", "KETCHUP", "CHEDDAR");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.65);
        System.out.println(USRegularMeal);


    }
}

