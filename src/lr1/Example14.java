package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int min = num - 1;
        int max = num + 1;
        int sum = min + max + num;
        int square = sum * sum;
        System.out.println(min + " " + num + " " + max + " " + square );
    }
}
