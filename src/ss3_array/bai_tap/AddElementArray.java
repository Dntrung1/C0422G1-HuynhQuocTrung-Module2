package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
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
        System.out.println("Nhập phần từ cần chèn");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập index cần chèn");
        int index = Integer.parseInt(scanner.nextLine());
        if (index<=-1 || index> arr.length-1){
            System.out.println("Không chèn được phần tử vào mảng");
        }else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i]=arr[i-1];
            }
            arr[index]=num;
            System.out.println(Arrays.toString(arr));
        }
    }
}
