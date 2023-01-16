package com.contact.Contact_MS.Entity;

public class Contact {

    private Long cid;
    private String city;
    private int  PhoneNo;
    private Long uid;

    public Contact(Long cid, String city, int phoneNo, Long uid) {
        this.cid = cid;
        this.city = city;
        PhoneNo = phoneNo;
        this.uid = uid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Contact() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }
}
