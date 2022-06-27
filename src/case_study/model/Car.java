package case_study.model;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String oToType;


    public Car(int seaOfControl, Producer producer, int year, String owner, int numberOfSeat, String oToType) {
        super(seaOfControl, producer, year, owner);
        this.numberOfSeat = numberOfSeat;
        this.oToType = oToType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getoToType() {
        return oToType;
    }

    public void setoToType(String oToType) {
        this.oToType = oToType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seaOfControl=" + seaOfControl +
                ", producer=" + producer.getPlu() +
                ", numberOfSeat=" + numberOfSeat +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                ", oToType='" + oToType + '\'' +
                '}';
    }
}
