package com.company.Ducks;

import com.company.Duck;
import com.company.Fly.FlyNoWay;
import com.company.Quack.Squeak;

public class RubberDock extends Duck {
    public RubberDock() {
        this.setFly(new FlyNoWay());
        this.setQuack(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a small toy.");
    }
}
