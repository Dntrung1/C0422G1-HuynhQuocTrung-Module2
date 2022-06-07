package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm trả chỉ số cân nặng");

        System.out.println("Nhập cân nặng");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight/ Math.pow(height,2);

        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (bmi>=18.5 && bmi <25){
            System.out.println("Normal");
        }else if (bmi>25 && bmi <30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
