package ss5_access_modifiers_and_static.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.getNumberofcar());

        Car car2 = new Car("Mazda 3","Skyactiv 6");
        System.out.println(Car.getNumberofcar());
    }
}
