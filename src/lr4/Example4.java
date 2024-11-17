package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольного треугольника: ");
        int height = in.nextInt();

        int[][] rec = new int[height][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                rec[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(rec[i][j]);
            }
            System.out.println(" ");
        }
    }
}
