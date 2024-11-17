package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int height = in.nextInt();

        int[][] rec = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rec[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rec[i][j]);
            }
            System.out.println(" ");
        }
    }
}
