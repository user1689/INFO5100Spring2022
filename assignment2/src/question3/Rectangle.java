package question3;

import java.awt.*;

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
    public void display(Graphics g){
        g.drawRect (10, 10, (int)this.length, (int)this.width);
    }

}
