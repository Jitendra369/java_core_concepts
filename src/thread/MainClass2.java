package thread;

import java.util.List;
import java.util.concurrent.*;

public class MainClass2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);

        List<Callable<Integer>> tasks = List.of(
                new MyCallableTask(),
                () -> 116,
                () -> 113,
                () -> 12
        );

        for (Callable<Integer> callable : tasks) {
            completionService.submit(callable);
        }

        // getting the result
        for (int i = 0; i < tasks.size(); i++) {
            Future<Integer> futureResult = completionService.take();
            System.out.println(futureResult.get());
        }
        executorService.shutdown();
    }
}
