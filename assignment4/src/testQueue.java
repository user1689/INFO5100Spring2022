import java.util.ArrayList;
import java.util.List;

public class testQueue {

    public static void main(String[] args) throws Exception{
        Queue q = new Queue(4);

        int threads = 2;
        int times = 10;

        List<Thread> threadList = new ArrayList<>(threads * 2);

        for (int i = 0; i < threads; i++) {
            final int offset = i * times;
            Thread producer = new Thread(() -> {
                try {
                    for (int j = 0; j < times; j++) {
                        q.add(offset + j);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            threadList.add(producer);
            producer.start();
        }

        for (int i = 0; i < threads; i++) {
            Thread consumer = new Thread(() -> {
                try {
                    for (int j = 0; j < times; j++) {
                        Integer element = (Integer) q.remove();
                        System.out.println(element);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            threadList.add(consumer);
            consumer.start();
        }

        // wait all threads to be finished
        for (Thread thread : threadList) {
            thread.join();
        }
    }
}
