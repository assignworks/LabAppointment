package net.banushan.labApp.web.dto;

import java.util.Date;

public class AppointmentDTO {
    private String PName;
    private int age;
    private String BType;
    private String tests;

    private String date;

    private int time;

    private String nameOnCard;

    private Long creditCardNumber;

    private int month;

    private int year;

    private int cvv;



    public AppointmentDTO() {
    }

    public AppointmentDTO(String PName, int age, String BType, String tests, String date, int time, String nameOnCard, Long creditCardNumber, int month, int year, int cvv) {
        this.PName = PName;
        this.age = age;
        this.BType = BType;
        this.tests = tests;
        this.date = date;
        this.time = time;
        this.nameOnCard = nameOnCard;
        this.creditCardNumber = creditCardNumber;
        this.month = month;
        this.year = year;
        this.cvv = cvv;
    }


    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBType() {
        return BType;
    }

    public void setBType(String BType) {
        this.BType = BType;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public Long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

}
