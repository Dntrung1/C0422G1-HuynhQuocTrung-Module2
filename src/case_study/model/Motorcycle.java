package case_study.model;

public class Motorcycle extends Vehicle{
    private int wattage;

    public Motorcycle() {
    }

    public Motorcycle(int seaOfControl, Producer producer, int year, String owner, int wattage) {
        super(seaOfControl, producer, year, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage=" + wattage +
                ", seaOfControl=" + seaOfControl +
                ", producer=" + producer +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
