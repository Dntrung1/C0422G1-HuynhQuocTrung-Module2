package ss1_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DigitalConversion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Nhập số thập phân cần chuyển đổi");
        int num = Integer.parseInt(scanner.nextLine());
        do {
            x = num % 2;
            stack.push(x);
            num= num / 2;
        }while (num>0);


        int[] arr = new int[stack.size()];
        String a = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i]= stack.pop();
            a += arr[i] + " ";
        }
        System.out.println("Sau khi chuyển đổi sang thập phân là " + a);
    }
}
