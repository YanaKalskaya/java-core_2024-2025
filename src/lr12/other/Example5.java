package lr12.other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Example5 {
    public static int findMax(int[] array) throws Exception {
        // Получаем количество доступных ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        
        // Размер части массива для каждого потока
        int chunkSize = array.length / numThreads;
        
        // Создаем и запускаем задачи для каждого потока
        Future<Integer>[] futures = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : start + chunkSize;
            
            futures[i] = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    int max = Integer.MIN_VALUE;
                    for (int j = start; j < end; j++) {
                        if (array[j] > max) {
                            max = array[j];
                        }
                    }
                    return max;
                }
            });
        }
        
        // Находим максимальное значение среди результатов всех потоков
        int max = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            int threadMax = future.get();
            if (threadMax > max) {
                max = threadMax;
            }
        }
        
        executor.shutdown();
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2, 9, 4, 7, 6};
        try {
            int max = findMax(array);
            System.out.println("Максимальный элемент в массиве: " + max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
