package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        if (size <= 0) {
            System.out.println("Nhập lại độ dài của mảng");
        } else
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần từ thứ : " + (i + 1));
                array[i] = Integer.parseInt(scanner.nextLine());
            }
        System.out.println("Màng vừa nhập vào");
        System.out.println(Arrays.toString(array));
        System.out.println("Mảng sau khi đảo");
        int[] array1 = new int[size];
        for (int i = 0; i < array.length; i++) {
            array1[array.length-1-i]= array[i];
        }
        System.out.println(Arrays.toString(array1));
        }
    }

