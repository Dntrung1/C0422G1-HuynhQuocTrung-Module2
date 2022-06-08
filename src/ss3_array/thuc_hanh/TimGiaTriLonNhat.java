package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Phần tử lớn nhất có giá trị là : " + max+ " vị trí trong mảng : " + index);
    }
}
