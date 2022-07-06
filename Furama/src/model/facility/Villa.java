package model.facility;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private byte soTang;

    public Villa() {

    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, byte soLuongNguoiToiDa, String kieuThue, String maDichVu, String tieuChuanPhong, double dienTichHoBoi, byte soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, maDichVu);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public byte getSoTang() {
        return soTang;
    }

    public void setSoTang(byte soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }

    public String toCSV() {
        return tenDichVu + "," + dienTichSuDung + "," + chiPhiThue + "," + soLuongNguoiToiDa + "," + kieuThue + "," + maDichVu + "," + tieuChuanPhong + "," + dienTichHoBoi + "," + soTang;
    }
}
