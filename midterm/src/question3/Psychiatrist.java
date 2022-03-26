package question3;

public class Psychiatrist {

    public void examine(moodyObject moodyObject) {
        moodyObject.queryMood();
    }

    public void observe(moodyObject moodyObject) {
        moodyObject.ExpressFeelings();
    }

    public String toString(moodyObject moodyObject) {
        return moodyObject.toString();
    }
}
