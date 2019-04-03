package hr.brewer.controllers;

import hr.brewer.models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class AuthenticationController {

    @GetMapping("/login")
    public User validateLogin() {
        return new User("User successfully authenticated");
    }
}
