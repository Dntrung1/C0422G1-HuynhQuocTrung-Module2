package ss14_sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử của mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi sắp xếp : " + Arrays.toString(arr));
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = arr.length-1; j > i ; j--) {
                if (arr[j]<arr[j-1]){
                    int x = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=x;
                    flag = true;
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("Mảng sau khi sắp xếp : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        bubbleSort();
    }
}
