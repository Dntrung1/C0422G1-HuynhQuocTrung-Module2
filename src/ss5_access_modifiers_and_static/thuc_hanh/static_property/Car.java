package ss5_access_modifiers_and_static.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    private static int numberofcar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofcar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberofcar() {
        return numberofcar;
    }

    public static void setNumberofcar(int numberofcar) {
        Car.numberofcar = numberofcar;
    }
}
