package question3;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width, String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        this.area = this.length * this.width;
    }

    public void computePerimeter() {
        this.perimeter = 2 * (this.length + this.width);
    }

    @Override
    protected void display() {
        System.out.println("This is " + this.getName() + " : its length is " + this.getLength() +" and its width is " + this.getWidth() );
        System.out.println("Rectangle's area is: " + this.getArea());
        System.out.println("Rectangle's perimeter is : " + this.getPerimeter());
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
