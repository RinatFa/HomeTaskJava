package org.example;

public class Human extends LivingBeing implements Running, Jumping {
    public Human(String name) {
        super(name, 42000, 0.92, "Человек");
    }

    @Override
    public void run() {
        System.out.println(this.name + " может бегать.");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " может прыгать.");
    }
}
