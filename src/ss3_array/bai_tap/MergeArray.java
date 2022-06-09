package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập phần tử mảng 1 vị trí " + i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Nhập độ dài mảng 2");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Nhập phần tử mảng 2 vị trí " + i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));

        int [] arr = new int[size1+size2];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));

    }

}
