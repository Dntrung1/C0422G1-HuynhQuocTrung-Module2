package model.facility;

public class House extends Facility {
    private String tieuChuanPhong;
    private byte soTang;

    public House() {

    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, byte soLuongNguoiToiDa, String kieuThue, String maDichVu, String tieuChuanPhong, byte soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, maDichVu);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public byte getSoTang() {
        return soTang;
    }

    public void setSoTang(byte soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    public String toCSV(){
        return tenDichVu +","+ dienTichSuDung +","+ chiPhiThue +","+ soLuongNguoiToiDa +","+ kieuThue +","+ maDichVu +","+ tieuChuanPhong +","+ soTang;
    }
}
