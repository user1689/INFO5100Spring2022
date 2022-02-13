package question2;
// Triangle
public class Triangle extends Shape{
    private int base;
    private int height = 0;

    public Triangle(int side, String name, String color) {
        super(name, color);
        this.base = side;
    }

    public Triangle(int base, int height, String name, String color) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void printShape() {
        System.out.println(this.getName());
    }

    @Override
    public double getArea() {
        if (this.height != 0) {
            return (this.base * this.height) / 2;
        } else {
            return (this.base * Math.sqrt(((this.base) * (this.base)) - ((this.base / 2) * (this.base / 2)))) / 2;
        }
    }

    @Override
    public double getPerimeter() {
        if (this.height != 0) {
            return (Math.sqrt(((this.base / 2) * (this.base / 2)) + (this.height) * (this.height)) * 2) + this.base;
        } else {
            return this.base * 3;
        }
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
