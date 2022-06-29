package ss19_string_and_regex.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexClass = "^[C A P][0-9]{4}[G H I K L M]$";
        System.out.println("Nhập lớp kiểm tra");
        String c = scanner.next();
        boolean checkClass = c.matches(regexClass);
        System.out.println(checkClass);
    }
}
