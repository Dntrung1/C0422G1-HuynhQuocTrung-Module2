package model.person;

import java.time.LocalDate;

public class Employee extends Person{
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {

    }

    public Employee(String name, LocalDate ngaySinh, String gioiTinh, String cMND, String phone, String email, String maNhanVien, String trinhDo, String viTri, double luong) {
        super(name, ngaySinh, gioiTinh, cMND, phone, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cMND='" + cMND + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    public String toCSV(){
        return name + "," + ngaySinh + "," + gioiTinh + "," + cMND + "," + phone + "," + email + "," + maNhanVien + "," + trinhDo + "," + viTri + "," + luong;
    }
}
