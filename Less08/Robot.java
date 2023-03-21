package org.example;

public class Robot extends LivingBeing implements Running, Jumping {
    public Robot(String name) {
        super(name, 100000, 0.4, "Робот");
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
