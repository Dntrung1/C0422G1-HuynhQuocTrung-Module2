package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất có dạng: a * x + b = c");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhấp số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double x = (c-b)/a;
            System.out.println("x có giá trí là: " + x);
        }else {
            if (b==c){
                System.out.println("Đúng với mọi giá trị x");
            }else {
                System.out.println("Phương trình sai");
            }
        }

    }
}
