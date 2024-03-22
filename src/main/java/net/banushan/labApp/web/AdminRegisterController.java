package net.banushan.labApp.web;

import net.banushan.labApp.service.AdminRegService;
import net.banushan.labApp.web.dto.AdminRegDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/adminRegistration")
public class AdminRegisterController {

    @Autowired
    private AdminRegService adminRegService;


    public AdminRegisterController(AdminRegService adminRegService) {
        super();
        this.adminRegService = adminRegService;
    }

    @ModelAttribute("admin")
    public AdminRegDTO adminRegDTO(){
        return new AdminRegDTO();
    }

    @GetMapping
    public  String showAdminRegistrationForm(){
        return "adminRegistrationForm";
    }


    @PostMapping
    public String registerUserAccount(@ModelAttribute("admin") AdminRegDTO adminRegDTO) {
        adminRegService.save(adminRegDTO);
        return "redirect:/registration?success";
    }




}
