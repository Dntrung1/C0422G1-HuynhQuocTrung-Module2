package case_study.model;

public abstract class Vehicle {
    protected int seaOfControl;
    protected Producer producer;
    protected  int year;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(int seaOfControl, Producer producer, int year, String owner) {
        this.seaOfControl = seaOfControl;
        this.producer = producer;
        this.year = year;
        this.owner = owner;
    }

    public int getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(int seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "seaOfControl=" + seaOfControl +
                ", producer=" + producer +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
