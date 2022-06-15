package ss7_abstract_class_interface.bai_tap.colorable;

import ss6_inheritance_and_polymophin.thuc_hanh.system_object.Shape;

public class Run {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0]= new Square("red",true,5);
        shape[1]=new Rectangle("Black", false, 4,5);
        for (int i = 0; i < shape.length; i++) {

            if (shape[i] instanceof Rectangle){
                System.out.println(((Rectangle) shape[i]).getArea());
            }else if( shape[i] instanceof Square){
                System.out.println(((Square) shape[i]).getArea());
                ((Square) shape[i]).howToColor();
            }

        }
    }


}
