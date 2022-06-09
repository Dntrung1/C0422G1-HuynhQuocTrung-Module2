package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxTwoWayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của hàng");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài của cột");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhập vị trí " + i + " và " + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                    index1 = i ;
                    index2 = j ;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " vị trị " + "["+index1+"][" + index2 + "]");
    }
}
