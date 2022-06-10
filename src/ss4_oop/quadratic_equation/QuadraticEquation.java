package ss4_oop.quadratic_equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getX1() {
        return (-this.b + Math.pow(this.getDelta(), 0.5)) / 2 * this.a;
    }

    public double getX2() {
        return (-this.b - Math.pow(this.getDelta(), 0.5)) / 2 * this.a;
    }

    public void display() {
        if (this.getDelta() > 0) {
            System.out.println("Nghiệm thứ nhất là : " + this.getX1());
            System.out.println("Nghiệm thứ hai là : " + this.getX2());
        } else if (this.getDelta() == 0) {
            System.out.println("Phương trình có nghiệm kép là: " + this.getX1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
