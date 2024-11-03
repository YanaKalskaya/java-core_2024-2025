package lr3;

import java.util.Scanner;

public class Example3v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите требуемую длину последовательности Фибоначчи: ");
        int num = in.nextInt();
        int a = 1, b = 1;
        int sum;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
