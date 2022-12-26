package creating.factory.coffee.factoryCoffee;

import creating.factory.coffee.Cappuccino;
import creating.factory.coffee.Coffee;

public class CappuccinoFactory  implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new Cappuccino();
    }
}
