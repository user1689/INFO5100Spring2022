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
    public void display(Graphics g){
        g.drawRect (10, 10, 200, 200);
    }
}
