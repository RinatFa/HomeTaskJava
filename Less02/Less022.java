// Задача2. Реализуйте алгоритм сортировки пузырьком
// числового массива, результат после каждой итерации
// запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;

public class Less022 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Less022.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = new int[] { 3, 8, 1, 9, 2, 6, 5, 4, 7 };
        for (int item : arr) {
            System.out.printf("%d ", item);
        }  // вывод массива до сортировки
        System.out.println();

        int temp;
        boolean flag;
        int n = arr.length;
        for (int i = 0; i < (n - 2); i++) {
            flag = false;
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    logger.info("Смена чисел " + arr[j] + " и "
                                               + arr[j + 1]);
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }  // сортировка пузырьком
        for (int item : arr) {
            System.out.printf("%d ", item);
        }  // вывод массива после сортировки
        System.out.println();
    }
}
