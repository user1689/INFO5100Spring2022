public class Main2 {

    public static long moneyInMyBank = 0;
    public static Object obj = new Object();
    public static void main(String[] args) {
        Thread microsoft = new Thread(new addMoney(1));
        microsoft.setName("microsoft");
        Thread northeastern = new Thread(new addMoney(1));
        northeastern.setName("northeastern");
        Thread google = new Thread(new addMoney(1));
        google.setName("google");
        microsoft.start();
        northeastern.start();
        google.start();
        System.out.println("This is " + Thread.currentThread().getName() + " Thread");
    }
}
