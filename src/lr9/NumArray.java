package lr9;

import java.util.Scanner;

public class NumArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        readArr(arr, 0);
        System.out.println("Введенный массив:");
        printArr(arr, 0);
    }

    private static void readArr(int[] array, int index) {
        if (array.length == index) {
            return;
        }
        System.out.print("Введите элемент " + (index + 1) + ": ");
        array[index] = in.nextInt();
        readArr(array, index + 1);
    }

    private static void printArr(int[] array, int index) {
        if (array.length == index) {
            return;
        }
        System.out.print(array[index] + " ");
        printArr(array, index + 1);
    }
}
