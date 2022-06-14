package ss6_inheritance_and_polymophin.bai_tap.point_and_moveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public Float[] getSpeed(){
        Float[] arr1 = new Float[2];
        arr1[0]=this.xSpeed;
        arr1[1]=this.ySpeed;
        return arr1;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                '}';
    }
    public MoveablePoint move(){
       super.setX(super.getX() + xSpeed);
       super.setY(super.getY() + ySpeed);
        return this;
    }
}
