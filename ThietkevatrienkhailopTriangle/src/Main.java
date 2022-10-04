import ra.Shape;
import ra.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red",true);
        System.out.println("-----------shape-----------");
        System.out.println(shape);
        Triangle triangle = new Triangle(shape.getColor(), shape.getFilled(),4,6,8);
        System.out.println("--------triangle---------");
        System.out.println(triangle);
        System.out.println("-----------Area-------------");
        System.out.println(triangle.getArea());
    }
}