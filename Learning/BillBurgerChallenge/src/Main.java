public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println("*".repeat(30));
    }
}