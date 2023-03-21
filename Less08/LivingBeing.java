package org.example;

public abstract class LivingBeing { // Живое существо
    protected String name;
    protected int maxRunDistance;
    protected double maxJumpRise;
    protected String type;

    // static int count;

    public LivingBeing(String name, int maxRunDistance, Double maxJumpRise, String type) {
        // public LivingBeing(String name, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpRise = maxJumpRise;
        this.type = type;
        // count++;
    }

    public void run() {
    }

    public void jump() {
    }

    public boolean runRunningtrack(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " успешно пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println(this.name + " НЕ СМОГ пробежать " + distance + " м.");
            return false;
        }
    }

    public boolean jumpWall(Double rise) {
        if (rise <= maxJumpRise) {
            System.out.println(this.name + " успешно перепрыгнул " + rise + " м.");
            return true;
        } else {
            System.out.println(this.name + " НЕ СМОГ перепрыгнуть " + rise + " м.");
            return false;
        }
    }
}
