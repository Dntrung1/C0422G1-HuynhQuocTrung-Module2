package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Shape;
import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Square;
import ss7_abstract_class_interface.bai_tap.colorable.Rectangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random()*100+1)/100;
        Shape[] shape = new Shape[3];
        shape[0]= new Circle("red", true,5);
        shape[1]=new Rectangle("black",false,4,5);
        shape[2]=new Square("blue",false,4);
        for (int i = 0; i < shape.length; i++) {
            System.out.println("trước khi thay đổi");
            System.out.println(shape[i].getArea());
        }
        for (int i = 0; i < shape.length; i++) {
            System.out.println("Sau khi thay đổi");
            if (shape[i] instanceof Resizeable){
                ((Resizeable) shape[i]).resize(percent);
                System.out.println(shape[i].getArea());
            }
        }
        System.out.println(percent);
    }
}
