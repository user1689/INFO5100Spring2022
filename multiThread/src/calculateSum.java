public class calculateSum implements Runnable{
    private int portion;

    public calculateSum (int portion) {
        this.portion = portion;
    }

    @Override
    public void run() {
        long sum = 0;
        int start = portion * Main.portionSize;
        int end = start + Main.portionSize;
        for (int i = start; i < end; i++) {
            sum += Main.values[i];
        }
        Main.portionSum[portion] = sum;
    }
}
