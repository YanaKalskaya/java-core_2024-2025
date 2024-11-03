package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите требуемую длину последовательности Фибоначчи: ");
        int num = in.nextInt();
        int a = 1, b = 1, i = 1;
        int sum;
        System.out.print("1 ");
        while (i < num) {
            System.out.print(b + " ");
            sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
}
