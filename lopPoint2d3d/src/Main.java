import ra.Point2D;
import ra.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 10);
        System.out.println(point2D);
        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 7);
        System.out.println(point3D);
    }
}