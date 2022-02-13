package question2;

public class Shape {
    private String name;
    private String color;
    private int area;
    private int perimeter;

    public Shape (String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Shape (String name, String color, int area, int perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void printShape() {
        System.out.println(this.name);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
