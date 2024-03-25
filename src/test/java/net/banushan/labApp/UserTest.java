package net.banushan.labApp;

import net.banushan.labApp.model.Appointment;
import net.banushan.labApp.model.User;
import net.banushan.labApp.repository.UserRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @Order(1)
    public void saveUser(){
        User user = new User();
        user.setFirstName("banushan");
        user.setLastName("demo");
        user.setEmail("demo2@gmail.com");
        user.setPassword("password");
        userRepository.save(user);
    }

    @Test
    @Order(2)
    public void getAll(){
        List<User> list = userRepository.findAll();
        org.assertj.core.api.Assertions.assertThat(list).size().isGreaterThan(0);
    }

    @Test
    @Order(3)
    public void getUser(){
        User user = userRepository.findById(8L).get();
        assertNotNull(userRepository.findById(8L).get());
    }

    @Test
    @Order(4)
    public  void updateUser(){
        User user = userRepository.findById(8L).get();
        user.setFirstName("singha");
        userRepository.save(user);
        assertNotEquals(43, userRepository.findById(8L).get().getFirstName());
    }

    @Test
    @Order(5)
    public void deleteUser(){
        userRepository.deleteById(8L);
        org.assertj.core.api.Assertions.assertThat(userRepository.existsById(8L)).isFalse();
    }

}
