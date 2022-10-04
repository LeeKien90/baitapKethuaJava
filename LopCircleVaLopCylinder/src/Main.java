import ra.Circle;
import ra.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle(5,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(21,"blue",10);
        System.out.println(cylinder);
    }
}