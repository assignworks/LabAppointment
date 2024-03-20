package net.banushan.labApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/appoinment")
	public String appoinment() {
		return "appointment";
	}

	@GetMapping("/appoinments")
	public String appoinments() {
		return "adminAppointmentStatus";
	}

}
