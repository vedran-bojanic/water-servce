package hr.brewer.controllers;

import hr.brewer.models.User;
import hr.brewer.services.SecurityService;
import hr.brewer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/registration")
    public void registration() { }

    @PostMapping("/registration")
    public void registration(@RequestBody User user) {
        userService.save(user);
        securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());
    }

    @GetMapping("/login")
    public String login() {
        return "Wataphuck!";
    }
}
