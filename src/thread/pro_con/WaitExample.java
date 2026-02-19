package thread.pro_con;

public class WaitExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();


        Thread consumer = new Thread(() -> {

            while (true) {
                try {
                    sharedResource.consume();
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        Thread produce = new Thread(() -> {
            try {
                int i = 1;
                while (true) {
                    sharedResource.produce(i++);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        consumer.start();
        produce.start();
    }


}
