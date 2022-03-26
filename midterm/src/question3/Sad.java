package question3;

public class Sad extends moodyObject{

    @Override
    String getMood() {
        return "sad";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString() {
        return "Subject cries a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " Today");
    }
}
