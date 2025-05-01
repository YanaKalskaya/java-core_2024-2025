package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] arr;
        int sum = 0;
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            arr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите значение элемента " + (i + 1) + ": ");
                arr[i] = scanner.nextByte();
                sum += arr[i];
            }
            System.out.println("Сумма элементов массива: " + sum);
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива должен быть положительным");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не могут быть преобразованы в тип byte");
        }
    }
}
