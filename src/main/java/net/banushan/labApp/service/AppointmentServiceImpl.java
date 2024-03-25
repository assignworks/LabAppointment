package net.banushan.labApp.service;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.Controller.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    net.banushan.labApp.repository.AppointmentRepo AppointmentRepo;

    @Override
    public List<Appointment> getAllAppoitnment() {
        return AppointmentRepo.findAll();
    }


    @Override
    public Appointment saveAppoinement(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment(appointmentDTO.getPName(), appointmentDTO.getEmail(), appointmentDTO.getAge(),appointmentDTO.getBType(), appointmentDTO.getTests(), appointmentDTO.getDate(), appointmentDTO.getTime(), appointmentDTO.getNameOnCard(), appointmentDTO.getCreditCardNumber(), appointmentDTO.getMonth(), appointmentDTO.getYear(), appointmentDTO.getCvv());
        return AppointmentRepo.save(appointment);
    }

    @Override
    public void deleteAppoinementById(int id) {
        AppointmentRepo.deleteById(id);
    }


}
