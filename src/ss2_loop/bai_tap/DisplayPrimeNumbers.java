package ss2_loop.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lớn nhất");
        int maxNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Các số nguyên tố nhỏ hơn" + maxNum + " là ");
        if (maxNum<2){
            System.out.println("Không có snt nào nhỏ hơn 2");
        }else
            for (int i = 2; i <maxNum ; i++) {
                boolean flag = true;
                for (int j = 2; j <i ; j++) {
                    if (i%j==0){
                        flag = false;
                    }
                }
                if (flag){
                    System.out.println(i);
                }
            }
    }
}
