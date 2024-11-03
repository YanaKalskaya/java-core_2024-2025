package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива равен: " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        int min = nums[0];
        for (int el : nums) {
            if (min > el) {
                min = el;
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.print("Его индекс(ы) = ");
        for (int i = 0; i < size; i++) {
            if (min == nums[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
