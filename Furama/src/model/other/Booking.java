package model.other;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String maBooking;
    private LocalDate ngayDen;
    private LocalDate ngayDI;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking() {
    }

    public Booking(String maBooking, LocalDate ngayDen, LocalDate ngayDI, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayDen = ngayDen;
        this.ngayDI = ngayDI;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public LocalDate getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(LocalDate ngayDen) {
        this.ngayDen = ngayDen;
    }

    public LocalDate getNgayDI() {
        return ngayDI;
    }

    public void setNgayDI(LocalDate ngayDI) {
        this.ngayDI = ngayDI;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayDen=" + ngayDen +
                ", ngayDI=" + ngayDI +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", loaiDichVu='" + loaiDichVu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(maBooking, booking.maBooking) && Objects.equals(maKhachHang, booking.maKhachHang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBooking, maKhachHang);
    }

    @Override
    public int compareTo(Booking o) {
        if (this.ngayDen.compareTo(o.ngayDen) > 0) {
            return 1;
        } else if (this.ngayDen.compareTo(o.ngayDen) < 0) {
            return -1;
        } else return this.getNgayDI().compareTo(o.getNgayDI());
    }

    public String toCSV() {
        return maBooking + "," + ngayDen + "," + ngayDI + "," + maKhachHang + "," + tenDichVu +"," + loaiDichVu;
    }
}
