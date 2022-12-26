package creating.factory.coffee.factoryCoffee;

import creating.factory.coffee.Coffee;
import creating.factory.coffee.Espresso;

public class EspressoFactory implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new Espresso();
    }
}
