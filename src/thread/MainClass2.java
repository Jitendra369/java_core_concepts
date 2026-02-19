package thread;

import java.util.concurrent.*;

public class MainClass2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);

        Future<Integer> future = completionService.submit(new MyCallableTask());
        Future<Integer> feature2 = completionService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 115;
            }
        });


        Integer result  = future.get();
        Integer i = feature2.get();
        System.out.println("result is : "+ result);
        System.out.println("result2 is : "+ i);
        System.out.println("waiting for the result  ");
        executorService.shutdown();
    }
}
