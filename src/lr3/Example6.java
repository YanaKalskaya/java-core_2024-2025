package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива: ");
            size = in.nextInt();
            if (size <= 0) {
                System.out.println("Введено некорректное значение!");
            }
        } while (size <= 0);

        int arr[] = new int[size];
        int num = 0;
        for (int i = 0; num < size; i++) {
            if (i % 5 == 2) {
                arr[num] = i;
                num++;
            }
        }
        System.out.print("Элементы массива: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
