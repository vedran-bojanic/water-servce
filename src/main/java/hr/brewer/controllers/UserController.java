package hr.brewer.controllers;

import hr.brewer.models.User;
import hr.brewer.services.SecurityService;
import hr.brewer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public void registration(User user) {
        userService.save(user);
        securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());
    }

    @GetMapping("/login")
    public String loginGet() {
        return "login";
    }

}
