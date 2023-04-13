package org.example;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        System.out.println();
        System.out.println(
                "*** Калькулятор комплексных чисел (сложение, умножение и деление) ***");
        String sStr = "";
        while (true) {
            double primaryArg = promptDouble(
                    "Введите Действительную часть 1 (первого) аргумента: ");
            double secondaryArg = promptDouble(
                    "Введите Мнимую часть 1 (первого) аргумента: ");
            Calculable calculator = calculableFactory.create(primaryArg, secondaryArg);
            while (true) {
                String cmd = prompt("Введите операцию (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    double arg1 = promptDouble(
                            "Введите Действительную часть 2 (второго/следующего) аргумента: ");
                    double arg2 = promptDouble(
                            "Введите Мнимую часть 2 (второго/следующего) аргумента: ");
                    calculator.multi(arg1, arg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg1 = promptDouble(
                            "Введите Действительную часть 2 (второго/следующего) аргумента: ");
                    double arg2 = promptDouble(
                            "Введите Мнимую часть 2 (второго/следующего) аргумента: ");
                    calculator.sum(arg1, arg2);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg1 = promptDouble(
                            "Введите Действительную часть 2 (второго/следующего) аргумента: ");
                    double arg2 = promptDouble(
                            "Введите Мнимую часть 2 (второго/следующего) аргумента: ");
                    calculator.div(arg1, arg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    double[] result = calculator.getResult();
                    sStr = (result[1] >= 0) ? " +" : " ";
                    System.out.printf("Результат =  %.5f" + sStr + "%.5fi\n", result[0], result[1]);
                    if (result[0] > 99999999.9)
                        System.out.println("Вы разделили на ноль!");
                    break;
                }
            }
            System.out.println();
            String cmd = prompt("Еще посчитать ( Y,y/N(любая клавиша) )? ");
            if ((cmd.equals("Y")) || (cmd.equals("y"))) {
                continue;
            }
            System.out.println("Завершение программы!");
            System.out.println();
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        if (message == "закрыть сканер")
            in.close();
        return in.nextLine();
    }

    private double promptDouble(String str) {
        boolean flag = false;
        String sName = "";
        double n = 0;
        Scanner iScanner = new Scanner(System.in);
        while (flag == false) {
            System.out.printf(str);
            sName = iScanner.nextLine();
            flag = isNumeric(sName);
            if (flag == true) {
                n = Double.parseDouble(sName);
            }
        }
        if (n > 100000000)
            iScanner.close();
        return n;
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
