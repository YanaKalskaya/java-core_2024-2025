package lr12.other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Example6 {
    public static int parallelSum(int[] array) throws Exception {
        // Получаем количество доступных ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        
        // Размер части массива для каждого потока
        int chunkSize = array.length / numThreads;
        Future<Integer>[] futures = new Future[numThreads];
        
        // Создаем и запускаем задачи для каждого потока
        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : start + chunkSize;
            
            futures[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            });
        }
        
        // Собираем результаты
        int totalSum = 0;
        for (Future<Integer> future : futures) {
            totalSum += future.get();
        }
        
        // Завершаем работу пула потоков
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        
        return totalSum;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int sum = parallelSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
