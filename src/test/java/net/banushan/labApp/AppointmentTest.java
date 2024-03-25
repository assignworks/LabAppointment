package net.banushan.labApp;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.repository.AppointmentRepo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppointmentTest {

    @Autowired
    private AppointmentRepo appointmentRepo;


    @Test
    @Order(1)
    public void saveAppointment(){
        Appointment appointment = new Appointment();
        appointment.setPName("kumar");
        appointment.setEmail("kumar@gmail.com");
        appointment.setAge(25);
        appointment.setBType("AB+");
        appointment.setTests("full blood test");
        appointment.setDate("2023-02-02");
        appointment.setTime(01);
        appointment.setNameOnCard("kumark");
        appointment.setCreditCardNumber(123456987);
        appointment.setMonth(12);
        appointment.setYear(2026);
        appointment.setCvv(123);
        appointmentRepo.save(appointment);
    }

    @Test
    @Order(2)
    public void getAll(){
        List<Appointment> list = appointmentRepo.findAll();
        org.assertj.core.api.Assertions.assertThat(list).size().isGreaterThan(0);
    }

    @Test
    @Order(3)
    public void getAppointment(){
        Appointment appointment = appointmentRepo.findById(29).get();
        assertNotNull(appointmentRepo.findById(29).get());
    }


    @Test
    @Order(4)
    public  void updateAppointment(){
        Appointment appointment = appointmentRepo.findById(29).get();
        appointment.setAge(33);
        appointmentRepo.save(appointment);
        assertNotEquals(43, appointmentRepo.findById(29).get().getAge());
    }

    @Test
    @Order(5)
    public void deleteAppointment(){
        appointmentRepo.deleteById(29);
        org.assertj.core.api.Assertions.assertThat(appointmentRepo.existsById(29)).isFalse();
    }


}
