package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("Сумма данных чисел: " + sum);
        System.out.println("Разность данных чисел: " + diff);
        scanner.close();
    }
}
