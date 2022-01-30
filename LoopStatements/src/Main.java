public class Main {
    public static void main(String[] args) {
        String[] names = {"jack", "sam", "roger", "leo", "marry"};
//        printNamesForLoop(names);
        whileLoop(names);

    }
    private static void printNamesForLoop(String[] names) {
        for (int i = 0; i < names.length; i += 1) {
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
        }
        System.out.println("*****************************");
        int i = 0;
        for (; i < names.length; i += 1) {
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
        }
    }

    private static void forEachLoop(String[] names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }

    private static void whileLoop(String[] names) {
        int index = 0;
        while (index < names.length) {
            System.out.println("Value of i = " + index);
            System.out.println("names[" + index + "] = " + names[index]);
            index += 1;
        }

        int idx = 0;
        while (true) {
            if (idx >= names.length) {
                break;
            }
            System.out.println("Value of i = " + idx);
            System.out.println("names[" + idx + "] = " + names[idx]);
            idx += 1;
        }

        int tmp = 0;
        do {
            System.out.println("Value of i = " + tmp);
            System.out.println("names[" + tmp + "] = " + names[tmp]);
            tmp += 1;
        } while (tmp < names.length);


    }


}
