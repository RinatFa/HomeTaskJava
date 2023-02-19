// Задача1. Написать программу вычисления n-ого треугольного числа
// Последовательность: 1=1, 2=3, 3=6, 4=10, 5=15, 6=21,...

import java.util.Scanner;

public class Less011 {
    public static void main(String[] args) {
        boolean flag = false; // флаг числового типа
        String sName = ""; // переменная ввода с клавиатуры
        int n = 0; // n треугольного числа
        Scanner iScanner = new Scanner(System.in);
        while (flag == false) {
            System.out.printf("Введите натуральное число: ");
            sName = iScanner.nextLine();
            flag = isNumeric(sName); // вызов функции проверки на число
            if (flag == true) {
                n = Integer.parseInt(sName); // перевод в число
                if (n < 1)          // положительное число
                    flag = false;
            }
        }
        iScanner.close();

        int iTn = n * (n + 1) / 2; // формула вычисления n-го треугольного числа
        System.out.printf("n-е треугольное число T(%d) = %d", n, iTn);
        System.out.println("");
        System.out.println("");
    }

    public static boolean isNumeric(String str) { // проверка на число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
