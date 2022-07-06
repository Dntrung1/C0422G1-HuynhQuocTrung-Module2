package model.facility;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, byte soLuongNguoiToiDa, String kieuThue, String maDichVu, String dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, maDichVu);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                ", dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }

    public String toCSV() {
        return tenDichVu + "," + dienTichSuDung + "," + chiPhiThue + "," + soLuongNguoiToiDa + "," + kieuThue + "," + maDichVu + "," + dichVuMienPhi;
    }
}
