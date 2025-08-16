package com.example.group42_desco.Nipa2211056;

public class ApNewConnection {
    private String name,address,nidNo,phoneNo,profession,gender;

    public ApNewConnection(String name, String address, String nidNo, String phoneNo, String profession, String gender) {
        this.name = name;
        this.address = address;
        this.nidNo = nidNo;
        this.phoneNo = phoneNo;
        this.profession = profession;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNidNo() {
        return nidNo;
    }

    public void setNidNo(String nidNo) {
        this.nidNo = nidNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ApNewConnection{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nidNo='" + nidNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", profession='" + profession + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
