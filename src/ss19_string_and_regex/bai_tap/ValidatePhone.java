package ss19_string_and_regex.bai_tap;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kt");
        do {
            String phone = scanner.nextLine();
            if (checkPhone(phone)) {
                System.out.println("ok");
                break;
            }
            System.out.println("Không đúng nhập lại");
        } while (true);
    }

    public static boolean checkPhone(String phone) {
        String regexPhoneVN = "^(\\+84|0)[\\s]*[0-9]{9}$";
        return phone.matches(regexPhoneVN);
    }
}
