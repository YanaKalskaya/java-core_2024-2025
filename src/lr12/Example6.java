package lr12;

import java.util.Random;
import java.util.Scanner;

public class Example6 {

    private static final Object lock = new Object();
    private static int sum;
    private static int numberOfCores;

    public static void main(String[] args) throws InterruptedException {

        numberOfCores = Runtime.getRuntime().availableProcessors();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину исходного массива: ");
        int arrLength = in.nextInt();

        Random random = new Random();
        int[] numbers = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            numbers[i] = random.nextInt(100);
        }

        sum = 0;

        //уменьшаем число потоков, если длина массива меньше, чем количество ядер для равномерного распределения
        if (arrLength <= numberOfCores) {
            numberOfCores = arrLength / 2;
        }

        for (int i = 0; i < numberOfCores; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                int tempSum = 0;
                int start = index * (arrLength / numberOfCores);
                int end = (index == numberOfCores - 1) ? arrLength : (index + 1) * (arrLength / numberOfCores);

                for (int j = start; j < end; j++) {
                        tempSum += numbers[j];
                }
                synchronized (lock) {
                        sum += tempSum;
                }
                System.out.println(Thread.currentThread().getName() + ": от " + start + " до " + end + ", сумма " + tempSum);
            });
            thread.start();
            thread.join();
        }

        System.out.print("Исходный массив: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Сумма элементов массива: " + sum);
    }
}
