package model.Facility;

import model.Facility.Facility;

public class Room extends Facility {
    String freeService;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
