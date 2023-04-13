package org.example;

public class LogCalculator implements Calculable {
    private double primaryArg;
    private double secondaryArg;
    private Log logger;

    public LogCalculator(double primaryArg, double secondaryArg, Log logger) {
        this.logger = logger;
        this.primaryArg = primaryArg;
        this.secondaryArg = secondaryArg;
        String sStr = (secondaryArg >= 0) ? " +" : " ";
        logger.loggerOut("исходное число:  " + primaryArg + sStr + secondaryArg + "i");
    }

    @Override
    public Calculable sum(double arg1, double arg2) {
        String sStr = (arg2 >= 0) ? " +" : " ";
        logger.loggerOut("суммирование с числом:  " + arg1 + sStr + arg2 + "i");
        primaryArg += arg1;
        secondaryArg += arg2;
        return this;
    }

    @Override
    public Calculable multi(double arg1, double arg2) {
        String sStr = (arg2 >= 0) ? " +" : " ";
        logger.loggerOut("умножение на число:  " + arg1 + sStr + arg2 + "i");
        double pArg = primaryArg;
        primaryArg = primaryArg * arg1 - secondaryArg * arg2;
        secondaryArg = secondaryArg * arg1 + pArg * arg2;
        return this;
    }

    @Override
    public Calculable div(double arg1, double arg2) {
        String sStr = (arg2 >= 0) ? " +" : " ";
        logger.loggerOut("деление на число:  " + arg1 + sStr + arg2 + "i");
        double pArg = primaryArg;
        double denominator = arg1 * arg1 + arg2 * arg2;
        if (denominator == 0) {
            primaryArg = 1000000000.00000;
            secondaryArg = 1000000000.00000;
        } else {
            primaryArg = (primaryArg * arg1 + secondaryArg * arg2) / denominator;
            secondaryArg = (secondaryArg * arg1 - pArg * arg2) / denominator;
        }
        return this;
    }

    @Override
    public double[] getResult() {
        logger.loggerOut("части комплексного числа:  " +
                primaryArg + " и " + secondaryArg);
        double[] darray = new double[2];
        darray[0] = primaryArg;
        darray[1] = secondaryArg;
        return darray;
    }
}
