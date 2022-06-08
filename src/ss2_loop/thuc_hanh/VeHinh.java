package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = -1;
        while (choise != 0) {
            System.out.println("Chọn Hình muốn vẽ");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình vuông");
            System.out.println("0. Exit");
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    break;
                case 2:
                    System.out.println("   *   ");
                    System.out.println(" * * *");
                    System.out.println("* * * *");
                    break;
                case 3:
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có trong menu");
            }
        }


    }
}
