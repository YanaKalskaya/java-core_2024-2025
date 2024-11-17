package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива: ");
        int columns = in.nextInt();
        System.out.println("Введите количество строк массива: ");
        int lines = in.nextInt();

        int[][] nums = new int[lines][columns];
        Random random = new Random();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                nums[i][j] = random.nextInt(200);
            }
        }
        System.out.println("Элементы массива: ");
        for (int[] row : nums) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        int[][] numsReverse = new int[columns][lines];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                numsReverse[i][j] = nums[j][i];
            }
        }
        System.out.println("Элементы обратного массива: ");
        for (int[] row : numsReverse) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
