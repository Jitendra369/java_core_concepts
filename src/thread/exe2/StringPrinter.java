package thread.exe2;

import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StringPrinter {

    ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(
                    2,
                    2,
                    0,
                    TimeUnit.MILLISECONDS,
                    new LinkedBlockingDeque<Runnable>());

    public void printString() {
        for (int i = 0; i < 6; i++) {
            threadPoolExecutor.execute(getRunnable(i));
        }
    }

    private Runnable getRunnable(final int i) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String randomString = UUID.randomUUID().toString();
                System.out.println("String returned is " + randomString);
            }
        };
        return runnable;
    }
}
