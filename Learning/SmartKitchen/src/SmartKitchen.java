public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);

    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);

    }

    public void loadDishes() {
        dishWasher.setHasWorkToDo(true);

    }

    public void setKitchenState(boolean coffeeStatus, boolean refrigeratorStatus, boolean dishWasherStatus) {
        brewMaster.setHasWorkToDo(coffeeStatus);
        iceBox.setHasWorkToDo(refrigeratorStatus);
        dishWasher.setHasWorkToDo(dishWasherStatus);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee...");
            setHasWorkToDo(false);
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher {
    private boolean hasWorkToDo;


    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing the dishes...");
            setHasWorkToDo(false);
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food...");
            setHasWorkToDo(false);
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}