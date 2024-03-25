package net.banushan.labApp.service;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.Controller.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentService {


    List<Appointment>getAllAppoitnment();



    Appointment saveAppoinement(AppointmentDTO appointmentDTO);

    void deleteAppoinementById(int id);
}
