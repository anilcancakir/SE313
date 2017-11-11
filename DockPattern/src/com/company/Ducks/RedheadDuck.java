package com.company.Ducks;

import com.company.Duck;
import com.company.Fly.FlyWithWings;
import com.company.Quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.setFly(new FlyWithWings());
        this.setQuack(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a really red duck.");
    }
}
