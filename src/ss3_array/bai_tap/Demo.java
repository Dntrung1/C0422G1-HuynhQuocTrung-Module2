package ss3_array.bai_tap;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] a = {2,5};
        System.out.println("Trước khi gọi hàm: " + Arrays.toString(a));
        display(a);
        System.out.println("Sau khi gọi hàm: " + Arrays.toString(a));

    }
    public static void display(int[] a) {
        a[0] = 20;
        a[1] = 25;
    }
}
