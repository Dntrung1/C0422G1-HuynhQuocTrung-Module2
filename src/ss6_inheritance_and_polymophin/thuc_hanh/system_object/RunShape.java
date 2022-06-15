package ss6_inheritance_and_polymophin.thuc_hanh.system_object;

import ss7_abstract_class_interface.bai_tap.resizeable.Square;

public class RunShape {
    public static void main(String[] args) {
        Square square = new Square("red", true, 5);
        System.out.println(square.getArea());
        System.out.println(square);
    }
}

