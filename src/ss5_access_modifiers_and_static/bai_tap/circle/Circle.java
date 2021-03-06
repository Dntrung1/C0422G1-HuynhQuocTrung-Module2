package ss5_access_modifiers_and_static.bai_tap.circle;

public class Circle {
    final double PI = 3.14;
    private double radius =1;
    private String color = "red";

    public  Circle (){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return PI * this.radius * this.radius;
    }
}
