package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String getUserPage2(ModelMap modelMap, Principal principal) {
        modelMap.addAttribute("users", userService.findUserByLogin(principal.getName()));
        return "singleUser";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, ModelMap modelMap) {
        modelMap.addAttribute("users", userService.getUserById(id));
        return "singleUser";
    }
}
