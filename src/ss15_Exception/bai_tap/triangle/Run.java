package ss15_Exception.bai_tap.triangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws TriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Triangle triangle = null;
        do {
            try {
                System.out.println("Nhập cạnh tam giác");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh tam giác");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh tam giác");
                double c = Double.parseDouble(scanner.nextLine());
                flag=false;
                triangle = new Triangle(a,b,c);
                System.out.println("Là hình tam giác");
            } catch (TriangleException triangleException) {
                System.out.println(triangleException.getMessage());
                flag = true;
                System.out.println("Nhập lại các cạnh");
            }catch (NumberFormatException numberFormatException){
                System.err.println("thằng ngu nhập số vào");
                System.out.println("Nhập lại các cạnh");
                flag = true;
            }
        }while (flag);
        
        System.out.println(triangle);
    }
}
