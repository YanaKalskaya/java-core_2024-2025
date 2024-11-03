package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int min = a;
        int max = b;
        if (a > b) {
            min = b;
            max = a;
        }
        while (min <= max) {
            System.out.print(min + " ");
            min++;
        }
    }
}
