package net.banushan.labApp.model;

import javax.persistence.*;

@Entity
@Table(name =  "appoinment")
public class Appointment {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String PName;
    private int age;
    private String BType;
    private String tests;

    public Appointment() {
    }

    public Appointment(String PName, int age, String BType, String tests) {

        this.PName = PName;
        this.age = age;
        this.BType = BType;
        this.tests = tests;
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
}
