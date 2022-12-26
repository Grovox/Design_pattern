package creating.factory;
import creating.factory.coffee.Coffee;
import creating.factory.coffee.factoryCoffee.*;
public class User {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = createCoffeeBySpecialty("Americano");
        Coffee coffee = coffeeFactory.create();
        coffee.makeCoffee();

        coffeeFactory = createCoffeeBySpecialty("Cappuccino");
        coffee = coffeeFactory.create();
        coffee.makeCoffee();

        coffeeFactory = createCoffeeBySpecialty("Espresso");
        coffee = coffeeFactory.create();
        coffee.makeCoffee();

    }
    static CoffeeFactory createCoffeeBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Americano")){
            return new AmericanoFactory();
        } else if (specialty.equalsIgnoreCase("Cappuccino")){
            return new CappuccinoFactory();
        } else if (specialty.equalsIgnoreCase("Espresso")){
            return new EspressoFactory();
        } else {
            throw new RuntimeException(specialty + "is unknown specialty.");
        }
    }
}
