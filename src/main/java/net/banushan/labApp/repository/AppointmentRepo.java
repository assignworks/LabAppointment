package net.banushan.labApp.repository;

import net.banushan.labApp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
