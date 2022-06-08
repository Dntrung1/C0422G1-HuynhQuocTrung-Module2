package ss2_loop.bai_tap;

import java.util.Date;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = -1;
        while (choise != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Tam giác vuông");
            System.out.println("3. tam giác cân");
            System.out.println("4. Exit");
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("Nhập chiều dài");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng");
                    int width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông (Góc là hình vuông có 4 góc khác nhau: trên cùng bên trái, trên cùng bên phải, dưới cùng bên trái, dưới cùng bên phải)");
                    System.out.println("Nhập chiều cao");
                    int x = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng");
                    int y = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = x; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hình tam giác cân");
                    System.out.println("Nhập chiều cao");
                    int n = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <=n-i ; j++) {
                        System.out.print(" ");
                    }

                        for (int j = 1; j <= 2*i-1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Không có trong Menu");
            }
        }
    }
}
