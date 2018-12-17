package kpfu.aisalin.service.interfaces;

import kpfu.aisalin.exception.BadAuthentificationException;
import kpfu.aisalin.model.Project;
import kpfu.aisalin.model.Task;
import kpfu.aisalin.model.Users;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

public interface UserService {
    void register(String username, String password, String password2) throws BadAuthentificationException;
    Users getUserByLogin(String login);

    HashMap<Project,List<Task>> getUserProjectsWithTasks(Users currentUsers);

    int getUserSalary(Users user);

    void changePassword(Users user, String password, String password2) throws BadAuthentificationException;

    void chngeImg(Users user, String img);
}
