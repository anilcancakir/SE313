package com.company.Quack;

import com.company.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< mute >>");
    }
}
