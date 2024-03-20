package net.javaguides.springboot.web;

import net.javaguides.springboot.service.AppointmentService;
import net.javaguides.springboot.web.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "redirect:/appointment?success";
    }
}
