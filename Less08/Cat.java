package org.example;

public class Cat extends LivingBeing implements Running, Jumping {
    public Cat(String name) {
        super(name, 250, 2.5, "Кот");
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
