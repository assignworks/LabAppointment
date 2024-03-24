package net.banushan.labApp.service;

import net.banushan.labApp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.banushan.labApp.Controller.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
