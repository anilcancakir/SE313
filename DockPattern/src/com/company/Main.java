package com.company;

import com.company.Ducks.MallardDuck;
import com.company.Ducks.RedheadDuck;
import com.company.Ducks.RubberDock;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing the mallard duck.");
        MallardDuck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();
        mallard.display();
        mallard.swim();

        System.out.println();
        System.out.println("Testing the redhead duck.");
        RedheadDuck redhead = new RedheadDuck();
        redhead.fly();
        redhead.quack();
        redhead.display();
        redhead.swim();

        System.out.println();
        System.out.println("Testing the rubber duck.");
        RubberDock rubber = new RubberDock();
        rubber.fly();
        rubber.quack();
        rubber.display();
        rubber.swim();
    }
}
