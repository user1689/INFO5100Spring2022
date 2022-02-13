package question3;

import java.awt.*;

public class Circle extends Shape{

    private double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        System.out.println("circle area is " + this.radius * this.radius * Math.PI);
    }

    public void computePerimeter() {
        System.out.println("circle perimeter is " + 2 * this.radius * Math.PI);
    }

    @Override
    protected void display() {
        int r = (int)this.radius;
        for (int y = 0; y <= 2 * r; y += 2) {
            int x = (int)Math.round(r - Math.sqrt(2 * r * y - y * y));
            int len = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }

            System.out.println('*');

        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
