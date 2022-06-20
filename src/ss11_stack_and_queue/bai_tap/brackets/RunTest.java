package ss11_stack_and_queue.bai_tap.brackets;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biếu thức");
        String str = scanner.nextLine();
        System.out.println( CheckBrackets.checkBrackets(str));

    }
}
