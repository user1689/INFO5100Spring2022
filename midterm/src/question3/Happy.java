package question3;

public class Happy extends moodyObject{
    @Override
    String getMood() {
        return "happy";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " Today");
    }
}
