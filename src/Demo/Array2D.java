package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
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
    }
}
