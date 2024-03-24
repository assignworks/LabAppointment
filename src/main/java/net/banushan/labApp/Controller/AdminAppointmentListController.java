package net.banushan.labApp.Controller;

import net.banushan.labApp.service.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminAppointmentListController {


    AppointmentService appoinmentService;

    public AdminAppointmentListController(AppointmentService appoinmentService) {
        this.appoinmentService = appoinmentService;
    }

    @RequestMapping("/adminPatientsList")
    public String listAppointments(Model model) {
        model.addAttribute("adminPatientsList", appoinmentService.getAllAppoitnment());
        return "adminPatientsList";
    }


    @GetMapping("/adminPatientsList/{id}")
    public String deleteAppointment(@PathVariable int id) {
        appoinmentService.deleteAppoinementById(id);
        return "redirect:/adminPatientsList";
    }
}

