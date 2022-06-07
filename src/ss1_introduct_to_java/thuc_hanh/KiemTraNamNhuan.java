package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kiểm Tra Năm nhuận");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Là năm nhuận");
                } else {
                    System.out.println("Không phải là năm nhuận");
                }
            }else {
                System.out.println("Năm nhuận");
            }
        }else {
            System.out.println("Không phải là năm nhuận");
        }
    }
}

