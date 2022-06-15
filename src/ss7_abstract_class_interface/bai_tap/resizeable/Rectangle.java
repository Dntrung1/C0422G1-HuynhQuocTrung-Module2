package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width=1.0;
    private double height=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {
        height+=(height*percent/100);
        width+=(width*percent/100);
    }
}
