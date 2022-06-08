package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        String[] array = new String[size];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            array[i]= scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
        String name = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i])){
                System.out.println(i);
            }
        }
    }
}
