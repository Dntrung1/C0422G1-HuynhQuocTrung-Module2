package ss1_stack_and_queue.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập độ dài của stack");
        int size = Integer.parseInt(scanner.nextLine());
        int[]arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("thêm phần tử index" + i);
            int number= Integer.parseInt(scanner.nextLine());
            stack.push(number);
        }
        for (int i = 0; i < size; i++) {
            arr[i]=stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));;
    }
}
