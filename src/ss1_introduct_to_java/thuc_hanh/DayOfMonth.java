package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tìm số ngày có trong tháng");
        int month = Integer.parseInt(scanner.nextLine());

        switch (month){
            case 2:
                System.out.println("Có thế có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 30 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 31 Ngày");
            default:
                System.out.println("Số tháng không hợp lệ");
        }
    }
}
