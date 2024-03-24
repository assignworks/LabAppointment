package net.banushan.labApp.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name =  "appoinment")
public class Appointment {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String PName;

    private String email;
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


    public Appointment() {
    }

    public Appointment(String PName, String email, int age, String BType, String tests, String date, int time, String nameOnCard, Long creditCardNumber, int month, int year, int cvv) {
        this.PName = PName;
        this.email= email;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", PName='" + PName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", BType='" + BType + '\'' +
                ", tests='" + tests + '\'' +
                ", date='" + date + '\'' +
                ", time=" + time +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", month=" + month +
                ", year=" + year +
                ", cvv=" + cvv +
                '}';
    }
}
