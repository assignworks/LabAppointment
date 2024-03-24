package net.banushan.labApp.Controller;

import net.banushan.labApp.service.AppointmentService;
import net.banushan.labApp.Controller.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appoinmentService;

    @ModelAttribute("appointment")
    public AppointmentDTO appoinmentDTO() {
        return new AppointmentDTO();
    }

    @GetMapping
    public String showAppointmentForm() {
        return "appointment";
    }



    @PostMapping
    public String appointment(@ModelAttribute("appointment") AppointmentDTO AppointmentDTO) {
        appoinmentService.saveAppoinement(AppointmentDTO);
        return "appointmentSuccess";
    }


}
