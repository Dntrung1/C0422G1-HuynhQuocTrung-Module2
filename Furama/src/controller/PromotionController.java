package controller;

import java.util.Scanner;

public class PromotionController {
    public static void displayPromotion() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng Promotion Management" +
                    "\n 1. Display list customers use service" +
                    "\n 2. Display list customers get voucher" +
                    "\n 3. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list customers use service");
                    break;
                case "2":
                    System.out.println("Display list customers get voucher");
                    break;
                case "3":
                   return;
                default:
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
