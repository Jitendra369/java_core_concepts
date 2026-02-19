package thread.pro_con;

public class SharedResource {
    private boolean avaliable = false;
    private int value;

    public synchronized void produce(int val) throws InterruptedException {
        while (avaliable) {
            wait();
        }

        value = val;
        System.out.println("produce val :" + value);
        avaliable = true;
        notifyAll();
    }


    public synchronized void consume() throws InterruptedException {
        while (!avaliable) {
            System.out.println("wating for producer to produce ");
            wait();
        }
        System.out.println("consume...");
        avaliable = false;
        notifyAll();
    }
}
