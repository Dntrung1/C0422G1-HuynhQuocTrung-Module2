package ss6_inheritance_and_polymophin.bai_tap.point2D_and_point3D;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[]arr1= new float[3];
        arr1[0] = super.getX();
        arr1[1] = super.getY();
        arr1[2] = this.z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
