package com.lib_system.model;
import java.time.LocalDate;

public class MemberRecord {

    private String memberId;
    private String name;
    private String type;
    private String phoneNo;
    private String address;
    private int maxBookLimit;
    private int noBooksIssued;
    private LocalDate dateOfMembership;

    public MemberRecord(String memberId, String type, String name, String address, String phoneNo) {
        this.memberId = memberId;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dateOfMembership = LocalDate.now();
        this.noBooksIssued = 0;
        this.maxBookLimit = type.equals("faculty") ? 10 : 5;
    }

    public String getMemberId() { return this.memberId; }
    public String getName() { return this.name; }
    public String getType() { return this.type; }
    public String getPhoneNo() { return this.phoneNo; }
    public String getAddress() { return this.address; }
    public int getMaxBookLimit() { return this.maxBookLimit; }
    public int getNoBooksIssued() { return this.noBooksIssued; }
    public LocalDate getDateOfMembership() { return this.dateOfMembership; }

    public boolean getMember() {
        return true;
    }

    public void decBookIssued() {

        if (noBooksIssued > 0) {
            noBooksIssued--;
        }
    }

    public void incBookIssued() {

        if (noBooksIssued < maxBookLimit) {
            noBooksIssued++;
        }
    }

    public void payBill(double amount) {
        System.out.println("Bill of €" + amount + " paid by member -> " + name);
    }


}

