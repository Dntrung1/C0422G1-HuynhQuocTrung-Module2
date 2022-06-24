package ss15_Exception.bai_tap.triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws TriangleException {
        if (a<=0||b<=0||c<=0){
            throw new TriangleException("cạnh không được nhỏ hơn 0");
        }else if (a+b<c||a+c<b||b+c<a){
            throw new TriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
