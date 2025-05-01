package lr13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            if (rows <= 0 || cols <= 0) {
                throw new IllegalArgumentException();
            }

            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = random.nextInt(10);
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            int column = scanner.nextInt();

            if (column <= 0 || column > cols) {
                throw new ArrayIndexOutOfBoundsException("Столбца с номером " + column + " не существует");
            }

            System.out.println("Столбец " + column + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column - 1]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются целым числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: размер матрицы должен быть положительным");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
