package ss14_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortUpAscending {
    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử của mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------");
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần");
        System.out.println(Arrays.toString(arr));
    }
}
