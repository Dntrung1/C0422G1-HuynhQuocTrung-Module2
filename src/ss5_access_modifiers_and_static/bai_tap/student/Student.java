package ss5_access_modifiers_and_static.bai_tap.student;

public class Student {
    private String name = "Trung";
    private String classes = "CO4";

    public Student(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("Tên " + this.getName() + " Lớp " + this.getClasses());
    }
}
