package net.banushan.labApp.service;

import net.banushan.labApp.model.Admin;
import net.banushan.labApp.model.AdminRole;
import net.banushan.labApp.repository.AdminRepo;
import net.banushan.labApp.web.dto.AdminRegDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class AdminRegServiceImpl implements AdminRegService {

    @Autowired
    AdminRepo adminRepo;


    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public AdminRegServiceImpl(AdminRepo adminRepo) {
        super();
        this.adminRepo = adminRepo;
    }

    @Override
    public Admin save(AdminRegDTO adminRegDTO) {
        Admin admin = new Admin(adminRegDTO.getFirstName(), adminRegDTO.getLastName(),adminRegDTO.getEmail(),passwordEncoder.encode(adminRegDTO.getPassword()), Arrays.asList(new AdminRole("ROLE_ADMIN")));
        return adminRepo.save(admin);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Admin admin = adminRepo.findByEmail(username);
        if(admin == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(admin.getEmail(), admin.getPassword(), mapRolesToAuthorities(admin.getAdminoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<AdminRole> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

}
