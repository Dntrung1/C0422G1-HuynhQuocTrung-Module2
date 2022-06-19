package case_study.model;

public class Truck extends Vehicle{
    private double tonnage;

    public Truck() {
    }

    public Truck(int seaOfControl, Producer producer, int year, String owner, double tonnage) {
        super(seaOfControl, producer, year, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                ", seaOfControl=" + seaOfControl +
                ", producer=" + producer +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
