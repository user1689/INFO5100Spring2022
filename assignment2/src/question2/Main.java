package question2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Triangle(6, "sameSideTriangle", "red");
        Shape s2 = new Triangle(6, 4, "normalTrianle", "blue");
        Shape s3 = new Rhombus(2, "square", "green");
        Shape s4 = new Rhombus(6, 8, "rhombus", "purple");

        double s1Area = s1.getArea();
        double s1Perimeter = s1.getPerimeter();
        String s1Name = s1.getName();
        System.out.println(s1Name + " area is " + s1Area + " perimeter is "+ s1Perimeter);
        double s2Area = s2.getArea();
        double s2Perimeter = s2.getPerimeter();
        String s2Name = s2.getName();
        System.out.println(s2Name + " area is " + s2Area + " perimeter is "+ s2Perimeter);
        double s3Area = s3.getArea();
        double s3Perimeter = s3.getPerimeter();
        String s3Name = s3.getName();
        System.out.println(s3Name + " area is " + s3Area + " perimeter is "+ s3Perimeter);
        double s4Area = s4.getArea();
        double s4Perimeter = s4.getPerimeter();
        String s4Name = s4.getName();
        System.out.println(s4Name + " area is " + s4Area + " perimeter is "+ s4Perimeter);

    }
}
