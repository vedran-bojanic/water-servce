package hr.brewer.controllers;

import hr.brewer.models.User;
import hr.brewer.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/login")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        this.userService.save(user);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return this.userService.getAllUser();
    }
}
