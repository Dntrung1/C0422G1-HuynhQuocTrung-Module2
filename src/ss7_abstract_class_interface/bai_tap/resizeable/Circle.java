package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius=1.0;
    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI +this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double length) {
       radius+=length;
    }
}
