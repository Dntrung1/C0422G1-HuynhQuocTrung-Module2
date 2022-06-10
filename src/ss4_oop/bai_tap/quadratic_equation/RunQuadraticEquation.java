package ss4_oop.bai_tap.quadratic_equation;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 có dạng ax2 + bx + c = 0");
        System.out.println("Nhập a");
        double a =Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b");
        double b =Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c");
        double c =Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.display();
    }
}
