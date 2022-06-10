package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ" + i);
            arr[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần từ cần xóa");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                for (int j = i; j <arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
