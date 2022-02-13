package question3;


public class shapeTester {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();

        System.out.println("This is Rectangle: its length is " + r.getLength() +" and its width is " + r.getWidth() );
        r.display();
        System.out.println("This is Circle: its radius is " + c.getRadius());
        c.display();
        s.display();
    }
}
