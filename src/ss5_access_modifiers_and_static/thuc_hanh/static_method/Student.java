package ss5_access_modifiers_and_static.thuc_hanh.static_method;

public class Student {
    private int rollno;
    public String name;
    private static String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + name + college);
    }
}
