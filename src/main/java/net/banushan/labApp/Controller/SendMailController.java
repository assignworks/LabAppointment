package net.banushan.labApp.Controller;

import net.banushan.labApp.Controller.dto.AppointmentDTO;
import net.banushan.labApp.Controller.dto.EmailDTO;
import net.banushan.labApp.model.Email;
import net.banushan.labApp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SendMailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendMailPatient")
    public String emailHome(){
        return "sendMailForm";
    }

    @ModelAttribute("sendMail")
    public EmailDTO emailDTO() {
        return new EmailDTO();
    }


    @PostMapping("sendMail")
    public String sendMail(@ModelAttribute EmailDTO emailDTO, HttpSession session){
        emailService.sendMail(emailDTO);
        return "sendMailForm";
    }

}
