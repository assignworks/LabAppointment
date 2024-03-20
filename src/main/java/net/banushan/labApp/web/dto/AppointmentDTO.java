package net.banushan.labApp.web.dto;

public class AppointmentDTO {
    private String PName;
    private int age;
    private String BType;
    private String tests;

    public AppointmentDTO() {
    }

    public AppointmentDTO(String PName, int age, String BType, String tests) {
        super();
        this.PName = PName;
        this.age = age;
        this.BType = BType;
        this.tests = tests;
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
