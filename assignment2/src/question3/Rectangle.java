package question3;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        System.out.println("rectangle area is " + this.length * this.width);
    }

    public void computePerimeter() {
        System.out.println("rectangle perimeter is " + 2 * (this.length + this.width));
    }

    @Override
    protected void display() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
