import java.util.ArrayList;
import java.util.List;

public class testQueue {

    public static void main(String[] args) throws Exception{
        Queue<Integer> q = new Queue<Integer>(4);

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

        // test whether push and pop of queue is safe
        if (q.isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println("queue is not empty");
        }

        // test whether peek of queue is safe
        Thread consumer2 = new Thread(() -> {
            try {
                int x = q.peek();
                System.out.println(x);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread producer2 = new Thread(() -> {
            try {
                q.add(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread consumer3 = new Thread(() -> {
            try {
                q.remove();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        consumer2.start();
        consumer3.start();
        Thread.sleep(2000);
        producer2.start();
        consumer2.join();
        producer2.join();
        consumer3.join();
    }
}
