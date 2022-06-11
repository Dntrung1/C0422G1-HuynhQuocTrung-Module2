package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập độ dài");
        int size1 = Integer.parseInt(scanner.nextLine());
        int size2 = size1;

        int[][] arr = new int[size1][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập các phần từ" + i + j);
                arr[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum =0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (size1==size2){
                   sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
