package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива: ");
        int columns = in.nextInt();
        System.out.println("Введите количество строк массива: ");
        int lines = in.nextInt();

        int[][] nums = new int[lines][columns];

        int counter = 1;
        for (int i = 0; i < lines; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    nums[i][j] = counter++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    nums[i][j] = counter++;
                }
            }
        }

        System.out.println("Элементы массива: ");
        for (int[] row : nums) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
