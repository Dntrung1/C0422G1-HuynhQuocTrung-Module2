package ss7_abstract_class_interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        ComparableCircle[] arr= new ComparableCircle[3];
        arr[0]= new ComparableCircle(5,"red");
        arr[1]=new ComparableCircle(4,"s");
        arr[2]=new ComparableCircle(10,"black");
        System.out.println("Trước khi sắp xếp");
        for (ComparableCircle c: arr) {
            System.out.println(c);
        }
        Arrays.sort(arr);

        System.out.println("Sau khi săp xếp");
        for (ComparableCircle c: arr) {
            System.out.println(c);
        }

    }
}
