package common;

import java.time.LocalDate;

public class Cash {
    private static final double VILLA = 300;
    private static final double HOUSE = 200;
    private static final double ROOM = 100;
    public static double datCocVilla(LocalDate ngayDen, LocalDate ngayDi){
        return (((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*VILLA)*30)/100;
    }
    public static double tongTienVilla(LocalDate ngayDen, LocalDate ngayDi){
        return ((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*VILLA);
    }

    public static double datCocHouse(LocalDate ngayDen, LocalDate ngayDi){
        return (((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*HOUSE)*30)/100;
    }
    public static double tongTienHouse(LocalDate ngayDen, LocalDate ngayDi){
        return ((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*HOUSE);
    }

    public static double datCocRoom(LocalDate ngayDen, LocalDate ngayDi){
        return (((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*ROOM)*30)/100;
    }
    public static double tongTienRoom(LocalDate ngayDen, LocalDate ngayDi){
        return ((ngayDi.getDayOfYear()-ngayDen.getDayOfYear())*ROOM);
    }
}
