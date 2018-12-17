package kpfu.aisalin.controller;

import kpfu.aisalin.model.Project;
import kpfu.aisalin.model.Task;
import kpfu.aisalin.model.Users;
import kpfu.aisalin.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
public class Handler {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String handle(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();
        Users currentUsers = userService.getUserByLogin(userName);
        //проекты пользователя с его задачами
        HashMap<Project, List<Task>> mapProjectsWithTasks = userService.getUserProjectsWithTasks(currentUsers);
        model.addAttribute("projects_tasks", mapProjectsWithTasks);
        model.addAttribute("companies", currentUsers.getCompanies());
        return "index";
    }

    @GetMapping("/account")
    public String getAccount(Model model) {
        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        Users user = userService.getUserByLogin(login);

        model.addAttribute("salary", userService.getUserSalary(user));
        model.addAttribute("user", user);
        model.addAttribute("userInf", user.getUserInf());
    return "account";
    }

    @GetMapping("/project")
    public String getProject(Model model) {
        return "project";
    }

    @GetMapping("/sign-in")
    public String getAuth(Model model) {
        return "signIn";
    }

    @GetMapping("/sign-up")
    public String getRegistration(Model model) {
        return "signUp";
    }

//    @GetMapping("/account")
//    public String getUserInfo(Model model) {
//        return "account";
//    }

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
        return "redirect:/home";
    }

    @PostMapping("/account")
    public String postPassChange(@RequestParam("password") String password,
                                 @RequestParam("password2") String password2,
                                 @RequestParam("img") String img,
                                 Model model){
        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        Users user = userService.getUserByLogin(login);
        try {
            userService.changePassword(user, password, password2);
            userService.chngeImg(user, img);
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
        }
        return "redirect:/account";
    }
}
