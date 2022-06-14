package ss6_inheritance_and_polymophin.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao");
        double h = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(r,"red",h);
        System.out.println("Thể tích hình trụ: "+ cylinder.getVolume());
        System.out.println(cylinder);
    }
}
