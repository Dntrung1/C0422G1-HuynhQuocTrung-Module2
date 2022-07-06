package model.person;

import java.time.LocalDate;

public class Person {
    protected String name;
    protected LocalDate ngaySinh;
    protected String gioiTinh;
    protected String cMND;
    protected String phone;
    protected String email;

    public Person() {
    }

    public Person(String name, LocalDate ngaySinh, String gioiTinh, String cMND, String phone, String email) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCMND() {
        return cMND;
    }

    public void setCMND(String cMND) {
        this.cMND = cMND;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cMND='" + cMND + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
