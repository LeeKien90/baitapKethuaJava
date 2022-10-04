package ra;

public class Point3D extends Point2D {
    public float z = 0.0F;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getX();
        super.getY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] n = {super.getX(), super.getY(), this.z};
        return n;
    }

    @Override
    public String toString() {
        return "Point3D{"+ "x=" + super.getX()+ ", y="+ super.getY()  + ", z=" + z + "}";
    }
}
