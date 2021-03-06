package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Shape;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    public double getPerimeter(){
        return (this.side+this.side)*2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }

    @Override
    public void resize(double length) {
        side+=length;
    }
}
