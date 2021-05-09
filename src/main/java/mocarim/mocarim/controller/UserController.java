package mocarim.mocarim.controller;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;


    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }

    @GetMapping("register")
    public String register(Model model) {
        model.addAttribute("name", "User Name");
        return "register";
    }

}
