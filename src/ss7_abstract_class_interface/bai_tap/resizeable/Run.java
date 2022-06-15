package ss7_abstract_class_interface.bai_tap.resizeable;

public class Run {
    public static void main(String[] args) {
//        Circle circle = new Circle("red", true,5);
//        System.out.println(circle.getArea());
//        circle.resize(6);
//        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle("black", true,5,6);
        System.out.println(rectangle.getHeight());
        System.out.println("Diện tích ban đầu của hình chữ nhật: "+rectangle.getArea());
        rectangle.resize(2);
        System.out.println(rectangle.getHeight());
        System.out.println("Diện tích sau khi thay đổi: "+rectangle.getArea());
    }
}
