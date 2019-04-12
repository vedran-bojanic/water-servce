package hr.brewer.controllers;

import hr.brewer.models.User;
import hr.brewer.models.UserDto;
import hr.brewer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserDto user) {
        return this.userService.save(user);
    }

}
