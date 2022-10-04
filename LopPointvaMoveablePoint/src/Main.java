import ra.MoveablePoint;
import ra.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10,7);
        System.out.println("-----Point------");
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(), 12,21);
        System.out.println("-------MoveablePoint--------");
        System.out.println(moveablePoint);
        System.out.println("----------MOVE----------");
        System.out.println(moveablePoint.move());
    }
}