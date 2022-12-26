package creating.factory.coffee.factoryCoffee;

import creating.factory.coffee.Americano;
import creating.factory.coffee.Coffee;

public class AmericanoFactory  implements CoffeeFactory {
    @Override
    public Coffee create() {
        return new Americano();
    }
}
