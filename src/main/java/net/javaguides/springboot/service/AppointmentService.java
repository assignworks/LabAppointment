package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Appointment;
import net.javaguides.springboot.web.dto.AppointmentDTO;

public interface AppointmentService {

    Appointment saveAppoinement(AppointmentDTO appointmentDTO);
}
