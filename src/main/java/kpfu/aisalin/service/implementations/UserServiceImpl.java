package kpfu.aisalin.service.implementations;

import kpfu.aisalin.dao.UserDAO;
import kpfu.aisalin.exception.BadAuthentificationException;
import kpfu.aisalin.model.Project;
import kpfu.aisalin.model.Task;
import kpfu.aisalin.model.Users;
import kpfu.aisalin.service.interfaces.UserService;
import kpfu.aisalin.validation.DataValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private DataValidator dataValidator;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final int fixedSaslary = 30000;
    private final int commonCountOfHours = 160;


    @Override
    public void register(String username, String password, String password2) throws BadAuthentificationException {
        username = username.trim();
        password = password.trim();
        password2 = password2.trim();
        dataValidator.validUsername(username);
        dataValidator.validPassword(password);
        dataValidator.equalPasswords(password, password2);

        Users users = Users.builder()
                .login(username)
                .password(passwordEncoder.encode(password))
                .role("users")
                .build();

        userDAO.save(users);
    }

    @Override
    public Users getUserByLogin(String login) {
        return userDAO.findByLogin(login).get(0);
    }

    @Override
    public HashMap<Project, List<Task>> getUserProjectsWithTasks(Users currentUsers) {
        HashMap<Project, List<Task>> result = new HashMap<>();
        for (Task task :
                currentUsers.getTasks()) {
            //узнаю проект данной задачи
            Project project = task.getProject();

            List<Task> tasks;
            if (result.containsKey(project)) {
                //добавляю задачу в нужный проект
                tasks = result.get(project);
            } else {
                //создаю новый список задач проекта
                tasks = new ArrayList<Task>();
                result.put(project, tasks);
            }
            tasks.add(task);
        }
        return result;
    }

    @Override
    public int getUserSalary(Users user) {
        return fixedSaslary / commonCountOfHours * user.getWorkedHours();
    }

    @Override
    public void changePassword(Users user, String password, String password2) throws BadAuthentificationException {
        if (password != null && password != "") {
        password = password.trim();
        password2 = password2.trim();
        dataValidator.validPassword(password);
        dataValidator.equalPasswords(password, password2);
        user.setPassword(passwordEncoder.encode(password));

            userDAO.save(user);
        }
    }

    @Override
    public void chngeImg(Users user, String img) {
        user.setImg(img);
        userDAO.save(user);
//        userDAO.setImageForId(img, user.getUserId());
    }
}
