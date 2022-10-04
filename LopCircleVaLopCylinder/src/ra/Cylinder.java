package ra;

public class Cylinder extends Circle{
    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volunm() {
        return height*area();
    }
    public String toString() {
        return "Chiều cao: " + height + " Thể tích: " + volunm();
    }
}
