// Задача3. +Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Less031 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 8, 1, 10, 9, 2, 6, 5, 4, 7 };
        for (int item : arr) {
            System.out.printf("%d ", item);
        }  // вывод массива до сортировки
        System.out.println();
        
        int[] result = MergeS(arr);

        for (int item : result) {
          System.out.printf("%d ", item);
        }  // вывод массива после сортировки
        System.out.println();
    } //main

    public static int[] MergeS(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = MergeSort(buffer1, buffer2, 0, sortArr.length);
        return result;
    } //MergeS

    public static int[] MergeSort(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = MergeSort(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = MergeSort(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result;
        if (sorted1 == buffer1) {
            result = buffer2;
        } else{
            result = buffer1;
        }
        while (index1 < middle && index2 < endIndex) {
            if (sorted1[index1] < sorted2[index2]) {
                result[destIndex++] = sorted1[index1++];
            } else {
                result[destIndex++] = sorted2[index2++];
            }
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    } //MergeSort
}
