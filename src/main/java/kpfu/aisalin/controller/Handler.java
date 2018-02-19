package kpfu.aisalin.controller;

import kpfu.aisalin.exception.BadAuthentificationException;
import kpfu.aisalin.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Handler {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");

        return "index";
    }

    @GetMapping("/sign-in")
    public String getAuth(Model model) {
        return "signIn";
    }

    @GetMapping("/sign-up")
    public String getRegistration(Model model) {
        return "signUp";
    }

    @GetMapping("/account")
    public String getUserInfo(Model model) {
        return "account";
    }

    @GetMapping("/projects")
    public String getProjects(Model model) {
        return "projects";
    }

    @GetMapping("/siteInfo")
    public String getSiteInfo(Model model) {
        return "siteInfo";
    }



    @PostMapping("/sign-up")
    public String postRegistration(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   @RequestParam("password2") String password2,
                                   Model model) {
        try {
            userService.register(username, password, password2);
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return "signUp";
        }
        return "index";
    }


}
