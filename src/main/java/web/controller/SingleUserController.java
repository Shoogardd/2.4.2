package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class SingleUserController {


    private final UserService userService;

    public SingleUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUserPage2(Model model, Principal principal) {
        model.addAttribute("users", userService.findUserByLogin(principal.getName()));
        return "singleUser";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("users", userService.getUserById(id));
        return "singleUser";
    }
}
