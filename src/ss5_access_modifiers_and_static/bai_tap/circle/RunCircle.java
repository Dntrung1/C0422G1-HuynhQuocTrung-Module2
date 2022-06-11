package ss5_access_modifiers_and_static.bai_tap.circle;

import ss5_access_modifiers_and_static.bai_tap.circle.Circle;

import java.util.Scanner;

public class RunCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        double r = Double.parseDouble(scanner.nextLine());
        Circle circle =new Circle();
        circle.setRadius(r);

        System.out.println("Bán kình hình tròn " + circle.getArea() + " " + "Có bán kình là " + circle.getRadius() + " "+ " Màu " + circle.getColor());
    }
}
