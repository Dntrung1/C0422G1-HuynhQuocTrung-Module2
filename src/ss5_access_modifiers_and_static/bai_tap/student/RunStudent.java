package ss5_access_modifiers_and_static.bai_tap.student;

import java.util.Scanner;

public class RunStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();

        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Tên học viên");
        String name = scanner.nextLine();
        s1.setName(name);
        System.out.println("Lớp");
        String classes = scanner.nextLine();
        s1.setClasses(classes);
        s1.display();
    }
}
