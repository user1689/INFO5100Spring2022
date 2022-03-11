
public class addMoney implements Runnable{
    int salary;

    public addMoney(int salary) {
        this.salary = salary;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Main2.obj) {
                Main2.moneyInMyBank = Main2.moneyInMyBank + salary;
                System.out.println(Thread.currentThread().getName() +
                        " added money to your bank account, total = "
                        + Main2.moneyInMyBank);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
