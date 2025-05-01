package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            int sum = 0;
            int count = 0;

            int[] arr = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                int el = scanner.nextInt();
                if (el > 0) {
                    arr[i] = el;
                    sum += arr[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются целым числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
