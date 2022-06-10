package ss4_oop.thuc_hanh;

public class Rectangle {
    double height;
    double width;
    public Rectangle(){
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double perimeter(){
        return (this.height + this.width) * 2;
    }

    public double area(){
        return this.width * this.height;
    }
    public String display(){
        return " Hình chữ nhật có chiều dài là: " + height + " và chiều rộng là: " +width;
    }
}



