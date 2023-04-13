package org.example;

public interface Calculable {
    Calculable sum(double arg1, double arg2);

    Calculable multi(double arg1, double arg2);

    Calculable div(double arg1, double arg2);

    double[] getResult();
}
