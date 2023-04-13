package org.example;

public class Factory implements ICalculableFactory {

    @Override
    public Calculable create(double primaryArg, double secondaryArg) {
        return new LogCalculator(primaryArg, secondaryArg, new Log());
    }
}
