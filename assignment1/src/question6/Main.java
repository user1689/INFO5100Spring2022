package question6;

import java.util.Scanner;

public class Main {
    public static double billsRule(int calls) {
        int option = -1;
        if (calls <= 100){
            option = 1;
        } else if ((calls > 100) && (calls <= 150)) {
            option = 2;
        } else if ((calls > 150) && (calls <= 200)) {
            option = 3;
        } else {
            option = 4;
        }

        double bills = 0;
        switch (option) {
            case 1:
                bills = 200;
                break;
            case 2:
                calls = calls - 100;
                bills = 200 + (0.6 * calls);
                break;
            case 3:
                calls = calls - 150;
                bills = 200 + (0.6 * 50) + (0.5 * calls);
                break;
            case 4:
                calls = calls - 200;
                bills = 200 + (0.6 * 50) + (0.5 * 50) + (0.4 * calls);
                break;
            default:
                System.out.println("inValid calls");
                break;
        }
        return bills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("Please enter the number of calls: ");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()) {
                num = num * 10 + scanner.nextInt();
            }
            break;
        }
        scanner.close();
        double bills = billsRule(num);
        System.out.println("your bills is $" + bills);
    }
}
