package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
