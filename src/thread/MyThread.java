package thread;

public class MyThread implements Runnable{

    @Override
    public void run() {

        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread :" + currentThread.getName() + " is excuting "+ " times "+ i );
        }
    }
}
