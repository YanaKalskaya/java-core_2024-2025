package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
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

        int delCol = random.nextInt(columns);
        int delLine = random.nextInt(lines);
        System.out.println("Индекс удаляемого столбца " + delCol);
        System.out.println("Индекс удаляемой строки " + delLine);

        int[][] newNums = new int[lines - 1][columns - 1];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if(i != delLine && j != delCol) {
                    newNums[i < delLine ? i : i - 1][j < delCol ? j : j - 1] = nums[i][j];
                }
            }
        }
        System.out.println("Элементы нового массива: ");
        for (int[] row : newNums) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
