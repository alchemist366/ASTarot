package kpfu.aisalin.controller;

import kpfu.aisalin.model.Task;
import kpfu.aisalin.service.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Persistence;
import java.net.Authenticator;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/task", params = "taskId")
    public String getTask(@RequestParam("taskId") long taskId,
                          Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        return "task";
    }
}
