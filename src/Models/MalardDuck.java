package Models;

import Models.FlyBehaviors.FlyWithWings;
import Models.QuackBehaviors.QuackBehavior;
import Models.QuackBehaviors.RealQuack;

public class MalardDuck extends Duck {
    public MalardDuck() {
        super();
        quackBehavior = new RealQuack();
        flyBehavior = new FlyWithWings();
    }
}
