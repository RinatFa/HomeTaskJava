package org.example;

public abstract class Obstacle {
    protected int length;
    protected double height;

    public Obstacle(int length, double height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
