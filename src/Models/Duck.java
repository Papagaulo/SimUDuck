package Models;

import Models.FlyBehaviors.FlyBehavior;
import Models.QuackBehaviors.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void PerformQuack(){
        quackBehavior.Quack();
    }
    public void PerformFly (){
        flyBehavior.Fly();
    }

    public void Display(){
        System.out.println("I'm a "+ this.getClass().getSimpleName());
    }
}
