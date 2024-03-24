package net.banushan.labApp.service;

import net.banushan.labApp.Controller.dto.EmailDTO;
import net.banushan.labApp.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;


@Service
public class EmailService {

    @Autowired
    private JavaMailSender javamailSender;

    public void  sendMail (EmailDTO emailDTO){
        try {

            MimeMessage message = javamailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            helper.setFrom("banushan8@gmail.com");
            helper.setTo(emailDTO.getTo());
            helper.setSubject(emailDTO.getSubject());
            helper.setText(emailDTO.getMessage());

            javamailSender.send(message);


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
