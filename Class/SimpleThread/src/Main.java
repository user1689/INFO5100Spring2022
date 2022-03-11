public class Main {

    public static void main(String[] args) {

//        Thread th =  new Thread(new ThreadClass());
//        th.setName("leo's Thread");
//        th.start();


//        for (int i = 0; i < 20; i++) {
//            System.out.println("Inside main Function Thread = " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        Thread[] arr = new Thread[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Thread(new ThreadClass());
//            arr[i].setName("Thread" + i);
//            arr[i].start();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Printing in the " + Thread.currentThread().getName() + " " + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        /**
         * PassingValueInThreadClass
        */
        Employee emp1 = new Employee("Leo", 18);
        Thread th1 = new Thread(new PassingValueInThreadClass(emp1));
        th1.setName("Employee Thread");
        th1.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("Inside main Function Thread = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
