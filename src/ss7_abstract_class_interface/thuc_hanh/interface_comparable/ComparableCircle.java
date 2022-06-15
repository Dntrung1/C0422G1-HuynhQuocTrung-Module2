package ss7_abstract_class_interface.thuc_hanh.interface_comparable;

import ss6_inheritance_and_polymophin.bai_tap.circle_and_cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (this.getRadius()-o.radius);
    }
}
