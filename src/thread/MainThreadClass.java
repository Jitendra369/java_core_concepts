package thread;

public class MainThreadClass {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        try {
//            “The current thread (main) is calling join() method of thread object”
            thread.join();  // this is called by main thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread mainThread = Thread.currentThread();
        System.out.println("main class thread name :" + mainThread.getName());
    }
}
