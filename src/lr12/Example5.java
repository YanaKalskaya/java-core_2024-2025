package lr12;

import java.util.Random;
import java.util.Scanner;

public class Example5 {

    private static final Object lock = new Object();
    private static int max;
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

        max = numbers[0];

        //уменьшаем число потоков, если длина массива меньше, чем количество ядер для равномерного распределения
        if (arrLength <= numberOfCores) {
            numberOfCores = arrLength / 2;
        }

        for (int i = 0; i < numberOfCores; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                int tempMax = max;
                int start = index * (arrLength / numberOfCores);
                int end = (index == numberOfCores - 1) ? arrLength : (index + 1) * (arrLength / numberOfCores);
                
                for (int j = start; j < end; j++) {
                    if(tempMax < numbers[j]) {
                        tempMax = numbers[j];
                    }
                }
                synchronized (lock) {
                    if (max < tempMax) {
                        max = tempMax;
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": от " + start + " до " + end + ", макс. значение " + tempMax);
            });
            thread.start();
            thread.join();
        }

        System.out.print("Исходный массив: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
    }
}
