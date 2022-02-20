public class ThreadClass implements Runnable  {
    // 1.extends Thread
    // 2.implements Runnable
    // 3.implements Callable
    // run() is different from start()
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing in " + Thread.currentThread().getName() + " " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
