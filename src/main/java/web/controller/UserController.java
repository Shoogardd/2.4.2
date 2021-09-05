package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/user")
    public String carController(ModelMap model) {

        model.addAttribute("users", userService.listUsers());

        return "User";
    }

    @GetMapping("/user/edit")
    public String editUser(@RequestParam(value = "id", required = false) Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "editPage";
    }

    @PostMapping(value = "users/edit")
    public String editUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        userService.editUser(user);
        return "redirect:/user";
    }

    @GetMapping("/user/delete")
    public String deleteUserById(@RequestParam(value = "id", required = false) Long id) {
        userService.delete(id);
        return "redirect:/user";
    }

    @GetMapping(value = "users/add")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "addUser";
    }

    @PostMapping(value = "users/add")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/user";
    }
}