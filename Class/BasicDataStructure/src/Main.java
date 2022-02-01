public class Main {

    public static void main(String[] args) {
        /*
        * byte
        * short
        * int
        * long
        * float
        * double
        * boolean
        * */
        boolean a = true;
        int b = 1;
        char c = 'a';
        float d = 3.45f;
        Integer bigInteger = 4;
        Character ch = 'z';
        String s = "I am a string";


        int[] arr = {1, 2, 3, 4, 5, 5, 8};
        arr[6] = 54;
        System.out.println(arr[6]);
        String[] strArr = {"h", "z", "g"};

        float baseSalary = 50000.0f;
        int dependents = 1;
        float salary;

//        if (dependents == 0) {
//            baseSalary = baseSalary - baseSalary * 0.4f;
//        } else if (dependents == 1) {
//            baseSalary = baseSalary - baseSalary * 0.3f;
//        } else {
//            baseSalary = baseSalary - baseSalary * 0.2f;
//        }

//        salary = calculateSalary(baseSalary, dependents);
        dependents = 2;
//        salary = calculateSalary(baseSalary, dependents);

        salary = calculateSalarySwitchStatment(baseSalary, dependents);
    }

    /**
     * calculateSalary Function
     * if my dependents are 0, tax rate = 40%
     * if dependents are 1, rate = 30%
     * 2 or more it is 20%
     */
    private static float calculateSalary(float baseSalary, int dependents) {
        float salary = 0;
        if (dependents == 0) {
            salary = baseSalary - baseSalary * 0.4f;
        } else if (dependents == 1) {
            salary = baseSalary - baseSalary * 0.3f;
        } else {
            salary = baseSalary - baseSalary * 0.2f;
        }
        return salary;
    }

    private static float calculateSalary(float baseSalary, int dependents, int year) {
        float salary = 0;
        if (year > 2000) {
            return calculateSalary(baseSalary, dependents);
        } else{
            return calculateSalarySwitchStatment(baseSalary, dependents);
        }
    }

    private static float calculateSalarySwitchStatment(float baseSalary, int dependents) {
        float salary = 0;
        switch (dependents) {
            case 0:
                salary = baseSalary - baseSalary * 0.4f;
                System.out.println("0 dependents:" + salary);
                break;
            case 1:
            case 2:
                salary = baseSalary - baseSalary * 0.3f;
                System.out.println("1 or 2 dependents:" + salary);
                break;
            case 3:
                salary = baseSalary - baseSalary * 0.2f;
                System.out.println("3 dependents:" + salary);
                break;
            default:
                salary = baseSalary - baseSalary * 0.1f;
                System.out.println("more than 3 dependents:" + salary);
                break;
        }
        return salary;
    }



}
