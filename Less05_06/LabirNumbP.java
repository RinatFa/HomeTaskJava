//Поле Лабиринта с границами 12 х 12

public class LabirNumbP {
    public static void main(String[] args) {
        // System.out.println(mapColor(getMap())); // возращает карту
    }

    static int[][] getMap() { // двумерный массив массивов чисел
        return new int[][] {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 00 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -2, -1,  1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1,  2 },
                { -1, 00, -1, -1, -1, -1, 00, 00, -1, 00, 00, -1,  3 },
                { -1, 00, 00, 00, 00, -1, 00, 00, -1, 00, 00, -1,  4 },
                { -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1,  5 },
                { -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1,  6 },
                { -1, 00, 00, 00, 00, -1, 00, 00, -1, 00, 00, -1,  7 },
                { -1, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, -1,  8 },
                { -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1,  9 },
                { -1, 00, 00, 00, 00, 00, 00, 00, -2, 00, 00, -1, 10 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 00 },
                { 00,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 00, 00 }
        };
    }
}
