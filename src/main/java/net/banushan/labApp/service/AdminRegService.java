package net.banushan.labApp.service;

import net.banushan.labApp.model.Admin;
import net.banushan.labApp.web.dto.AdminRegDTO;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface AdminRegService extends UserDetailsService {

    Admin save(AdminRegDTO adminRegDTO);
}
