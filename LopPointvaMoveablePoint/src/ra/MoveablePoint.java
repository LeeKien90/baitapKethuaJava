package ra;

public class MoveablePoint extends Point {
    public float xSpeed = 0.0F;
    public float ySpeed = 0.0F;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] m = {this.xSpeed,this.ySpeed};
        return m;
    }

    @Override
    public String toString() {
        return "MoveablePoint{"+super.toString() + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    public MoveablePoint move() {
       this.setX(super.getX() + xSpeed);
       this.setY(super.getY() + ySpeed);
       return this;
    }
}
