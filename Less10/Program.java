package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println();
        Calc calc3 = new Calc();
        System.out.println("сложение: 1.0 + 2.0 + 3.5 = " +
                calc3.sum(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.5))));
        System.out.println("умножение:      1 * 2 * 3 = " +
                calc3.mult(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println("деление:          6 / 2.5 = " +
                calc3.div(new ArrayList<>(Arrays.asList(6, 2.5))));
        int iN = 100;
        System.out.println("десятичный в двоичный для Integer: " + iN + " -> " +
                calc3.bin10to2(new ArrayList<>(Arrays.asList(iN))));
        Double dN = 100.0;
        System.out.println("десятичный в двоичный для Double:  " + dN.intValue() + " -> " +
                calc3.bin10to2(new ArrayList<>(Arrays.asList(dN))));
        Float fN = 100f;
        System.out.println("десятичный в двоичный для Float:   " + fN.intValue() + " -> " +
                calc3.bin10to2(new ArrayList<>(Arrays.asList(fN))));
        String sN = "1100100";
        System.out.println("двоичный в десятичный для String:  " + sN + " -> " +
                calc3.bin2to10(new ArrayList<>(Arrays.asList(Integer.parseInt(sN)))));
    }
}
