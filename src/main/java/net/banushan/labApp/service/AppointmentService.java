package net.banushan.labApp.service;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.web.dto.AppointmentDTO;

public interface AppointmentService {

    Appointment saveAppoinement(AppointmentDTO appointmentDTO);
}
