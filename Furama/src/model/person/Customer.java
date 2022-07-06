package model.person;

import java.time.LocalDate;

public class Customer extends Person{
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
       ;
    }

    public Customer(String name, LocalDate ngaySinh, String gioiTinh, String cMND, String phone, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(name, ngaySinh, gioiTinh, cMND, phone, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cMND='" + cMND + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public String toCSV(){
        return name +","+ ngaySinh +","+ gioiTinh +","+ cMND  +","+ phone +","+ email +","+ maKhachHang +","+ loaiKhach +","+ diaChi;
    }
}
