package model.other;

public class contact {
    private int soHopDong;
    private String maBooking;
    private double soTienDatCoc;
    private double tongTien;
    private String maKhachHang;

    public contact() {
    }

    public contact(int soHopDong, String maBooking, double soTienDatCoc, double tongTien, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienDatCoc = soTienDatCoc;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(double soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "contact{" +
                "soHopDong=" + soHopDong +
                ", maBooking='" + maBooking + '\'' +
                ", soTienDatCoc=" + soTienDatCoc +
                ", tongTien=" + tongTien +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
