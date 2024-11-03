package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char arr[] = new char[size];
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            arr[i] = letter;
            letter += 2;
        }
        System.out.print("Элементы массива: ");
        for (char l : arr) {
            System.out.print(l + " ");
        }
        System.out.println(" ");
        System.out.print("Элементы массива в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
