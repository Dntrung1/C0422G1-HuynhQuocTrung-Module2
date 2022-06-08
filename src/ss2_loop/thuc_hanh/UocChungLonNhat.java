package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm ước chung lớn nhất");
        System.out.println("Nhập số thứ nhất");
        int num1 = Integer.parseInt(scanner.nextLine());
        num1 = Math.abs(num1);
        System.out.println("Nhập số thứ 2");
        int num2 = Integer.parseInt(scanner.nextLine());
        num2 = Math.abs(num2);
        if (num1==0|| num2==0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (num1!=num2){
            if (num1>num2){
                num1 -= num2;
            }else {
                num2 -= num1;
            }
        }
        System.out.println("Ước chung lớn nhất là " + num1);
    }
}
