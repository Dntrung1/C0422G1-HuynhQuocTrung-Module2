package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính lãi suất");
        System.out.println("Nhập số tiền");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhấp số tháng");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lãi");
        double interest = Double.parseDouble(scanner.nextLine());
        double totalInterest=0;
        for (int i = 0; i < month; i++) {
            totalInterest += money *(interest/100)/12 * month;
        }
        System.out.println("tổng tiền lãi sau "+month+ " là "+totalInterest);
    }
}
