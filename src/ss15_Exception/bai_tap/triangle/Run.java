package ss15_Exception.bai_tap.triangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws TriangleException {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;
        do {
            try {
                System.out.println("Nhập cạnh tam giác");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh tam giác");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh tam giác");
                double c = Double.parseDouble(scanner.nextLine());
                triangle = new Triangle(a,b,c);
                System.out.println("Là hình tam giác");
                break;
            } catch (TriangleException triangleException) {
                System.out.println(triangleException.getMessage());
                System.out.println("Nhập lại các cạnh");
            }catch (NumberFormatException numberFormatException){
                System.err.println("thằng ngu nhập số vào");
                System.out.println("Nhập lại các cạnh");
            }
        }while (true);
        
        System.out.println(triangle);
    }
}
