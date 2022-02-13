package question2;

public class Rhombus extends Shape{

    private int diagonal1;
    private int diagonal2;

    public Rhombus (int diagonal, String name, String color) {
        super(name, color);
        this.diagonal1 = diagonal;
        this.diagonal2 = diagonal;
    }

    public Rhombus(int diagonal1, int diagonal2, String name, String color) {
        super(name, color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public void printShape() {
        System.out.println(this.getName());
    }

    @Override
    public double getArea() {
        if (this.diagonal1 != this.diagonal2){
            return (diagonal1 * diagonal2) / 2;
        } else {
            return ((diagonal1 / 2) * (diagonal1 / 2)) + ((diagonal1 / 2) * (diagonal1 / 2));
        }

    }

    @Override
    public double getPerimeter() {
        if (this.diagonal1 != this.diagonal2){
            return 4 * Math.sqrt((diagonal1 / 2) * (diagonal1 / 2) + ((diagonal2 / 2) * (diagonal2 / 2)));
        } else {
            return 4 * Math.sqrt((diagonal1 / 2) * (diagonal1 / 2) + ((diagonal2 / 2) * (diagonal2 / 2)));
        }
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
