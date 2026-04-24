package com.jad;

import java.util.ArrayList;

public class DuckFarm extends ArrayList<AbstractDuck> {
    public void quackAll() {
        for (AbstractDuck duck : this) {
            System.out.println(duck.getName() + " : " + duck.quack());
        }
    }

    public void flyAll() {
        for (AbstractDuck duck : this) {
            System.out.println(duck.fly());
        }
    }
}
