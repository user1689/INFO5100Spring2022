import java.time.Duration;
import java.time.Instant;

public class Main {
    public static int[] values = new int[500000000];
    public  static int portionSize = values.length / 5;
    public static long[] portionSum = new long[5];

    public static void main(String[] args) {

        generates();

//        calculate sum in main function
        Instant start = Instant.now();
        long sum = getSum();
        Instant end = Instant.now();

        System.out.println("Sum = " + sum);
        System.out.println("Time take to get sum: " + Duration.between(start, end).toMillis());

//        calculate sum in thread
        start = Instant.now();
        Thread[] threadArr = new Thread[5];
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread(new calculateSum(i));
            threadArr[i].setName("Thread " + i);
            threadArr[i].start();
        }


//        wait thread to execute
        for (int i = 0; i < threadArr.length; i++) {
            try {
                threadArr[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += portionSum[i];
        }
        end = Instant.now();
        System.out.println("Sum = " + sum);
        System.out.println("Time take to get sum: " + Duration.between(start, end).toMillis());

    }

    public static void generates() {
        for (int i = 0; i < values.length; i++) {
            values[i] = 100;
        }
    }

    public static long getSum() {
        long sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
