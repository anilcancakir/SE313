package com.company;

import com.company.Interfaces.FlyBehavior;
import com.company.Interfaces.QuackBehavior;

public abstract class Duck {
    private FlyBehavior fly;
    private QuackBehavior quack;

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }

    // The display is depends of the duck
    abstract public void display();

    public void fly() {
        this.fly.fly();;
    }

    public void quack() {
        this.quack.quack();;
    }

    public void swim() {
        // The all ducks can swim.
        System.out.println("I can swim.");
    }
}
