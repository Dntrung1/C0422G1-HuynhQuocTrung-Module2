package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài cảu mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + miniArr(array));
    }
    public static int miniArr(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min= arr[i];
            }
        }
        return min;
    }
}
