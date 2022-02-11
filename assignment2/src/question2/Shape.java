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
    public String printShape() {
        return this.name;
    }

    public int getArea() {
        return this.area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

}
