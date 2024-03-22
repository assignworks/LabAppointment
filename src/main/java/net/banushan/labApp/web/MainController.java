package net.banushan.labApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/registration")
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

	@GetMapping("/adminRegistration")
	public String adminRegistration() {
		return "adminRegistration";
	}

	@GetMapping("/adminDashboard")
	public String adminDashboard() {
		return "adminDashboard";
	}

}
