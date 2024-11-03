package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }
        System.out.println("Элементы массива до сортировки: ");
        for (int el : nums) {
            System.out.print(el + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] < nums[j]) {
                    int min = nums[i];
                    nums[i] = nums[j];
                    nums[j] = min;
                }
            }
        }
        System.out.println("Элементы массива после сортировки: ");
        for (int el : nums) {
            System.out.print(el + " ");
        }
    }
}
