package net.banushan.labApp.service;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.web.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    net.banushan.labApp.repository.AppointmentRepo AppointmentRepo;

    @Override
    public Appointment saveAppoinement(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment(appointmentDTO.getPName(), appointmentDTO.getAge(),appointmentDTO.getBType(), appointmentDTO.getTests(), appointmentDTO.getDate(), appointmentDTO.getTime(), appointmentDTO.getNameOnCard(), appointmentDTO.getCreditCardNumber(), appointmentDTO.getMonth(), appointmentDTO.getYear(), appointmentDTO.getCvv());
        return AppointmentRepo.save(appointment);
    }
}
