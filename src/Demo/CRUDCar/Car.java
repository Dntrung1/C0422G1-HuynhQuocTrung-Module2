package Demo.CRUDCar;

public class Car {
    private int id=1;
    private String name;
    private String color;
    private String producer;
    public static int count=1;
    public Car() {
    }

    public Car(int id, String name, String color, String producer) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.producer = producer;
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
