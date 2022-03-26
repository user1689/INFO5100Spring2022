package question3;

public class Main {

    public static void main(String[] args) {
        Psychiatrist p1 = new Psychiatrist();
        moodyObject mood1 = new Happy();
        moodyObject mood2 = new Sad();


        System.out.println("How are you feeling today?");
        p1.examine(mood1);
        p1.observe(mood1);
        System.out.print("Observation: ");
        System.out.println(p1.toString(mood1));

        System.out.println("How are you feeling today?");
        p1.examine(mood2);
        p1.observe(mood2);
        System.out.print("Observation: ");
        System.out.println(p1.toString(mood2));

    }
}
