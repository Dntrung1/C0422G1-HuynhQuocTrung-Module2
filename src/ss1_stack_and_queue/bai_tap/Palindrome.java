package ss1_stack_and_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi để kiểm tra");
        String str = scanner.nextLine();

        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            queue.add(str.charAt(i));
        }

        String result = "";
        while (!queue.isEmpty()) {
            result += queue.poll();
        }
        System.out.println(str);
        System.out.println(result);
        if(result.equalsIgnoreCase(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
