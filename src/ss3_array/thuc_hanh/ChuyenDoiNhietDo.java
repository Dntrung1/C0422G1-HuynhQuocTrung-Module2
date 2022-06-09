package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("Chương Trình chuyển đổi nhiệt độ");
            System.out.println("Chọn Chương trình chuyển đổi");
            System.out.println("1. Chuyển độ C sang độ F");
            System.out.println("2. Chuyển độ F sang độ C");
            System.out.println("0. Exit");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    System.out.println("Bạn chọn chương trình chuyển đổi độ C sang độ F");
                    System.out.println("Nhập độ C");
                    double c = Double.parseDouble(scanner.nextLine());
                    System.out.println("Độ F : " + celsiusToFahrenheit(c));
                    break;
                case 2:
                    System.out.println("Bạn chọn trường trình chuyển đổi độ F sang độ C");
                    System.out.println("Nhập độ F");
                    double f = Double.parseDouble(scanner.nextLine());
                    System.out.println("Độ C : " + fahrenheitToCelsius(f));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chọn lại chương trình");
            }
        }while (num !=0);
    }

    public static double celsiusToFahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double fahrenheitToCelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
