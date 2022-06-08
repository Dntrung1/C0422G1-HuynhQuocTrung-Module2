package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố");
        System.out.println("Nhập số cần kiểm tra:");
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        if (num<2){
            check = false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                check = false;
            }
        }
        if (check==true){
            System.out.println("Số " + num + " Là số nguyên tố");
        }else {
            System.out.println("Số " + num + " Không phải là số nguyên tố");
        }
    }
}
