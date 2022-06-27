package model.Person;

import java.time.LocalDate;

public class Customer extends Person{
    private String customerCode;
    private String guestOfType;
    private String address;

    public Customer() {
    }

    public Customer(String name, LocalDate dateOfBirth, String gender, String id, String phone, String email, String customerCode, String guestOfType, String address) {
        super(name, dateOfBirth, gender, id, phone, email);
        this.customerCode = customerCode;
        this.guestOfType = guestOfType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getGuestOfType() {
        return guestOfType;
    }

    public void setGuestOfType(String guestOfType) {
        this.guestOfType = guestOfType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", guestOfType='" + guestOfType + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
