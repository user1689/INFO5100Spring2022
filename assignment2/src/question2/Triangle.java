package question2;
// Triangle
public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int x, int y) {
        this.base = x;
        this.height = y;
    }

    public Triangle(int side) {

    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return side * 3;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
