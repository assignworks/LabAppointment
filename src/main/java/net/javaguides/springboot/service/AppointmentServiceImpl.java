package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Appointment;
import net.javaguides.springboot.repository.AppointmentRepo;
import net.javaguides.springboot.web.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepo AppointmentRepo;

    @Override
    public Appointment saveAppoinement(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment(appointmentDTO.getPName(), appointmentDTO.getAge(),appointmentDTO.getBType(), appointmentDTO.getTests());
        return AppointmentRepo.save(appointment);
    }
}
