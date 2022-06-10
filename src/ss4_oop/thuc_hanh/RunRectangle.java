package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class RunRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng của hình chữ nhật");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Chu vi hình chữ nhật");
        Rectangle rectangle = new Rectangle(height,width);
        System.out.println(rectangle.display());
        System.out.println("Chu vi hình chữ nhật là " + rectangle.perimeter());
        System.out.println("diện tích hình chữ nhật là " + rectangle.area());
    }
}
