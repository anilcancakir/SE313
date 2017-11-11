package com.company.Fly;

import com.company.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly anyway.");
    }
}
