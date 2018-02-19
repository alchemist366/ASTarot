package kpfu.aisalin.service.implementations;

import kpfu.aisalin.dao.UsersDAO;
import kpfu.aisalin.exception.BadAuthentificationException;
import kpfu.aisalin.model.Users;
import kpfu.aisalin.service.interfaces.UserService;
import kpfu.aisalin.validation.DataValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDAO usersDAO;

    @Autowired
    private DataValidator dataValidator;


    @Override
    public void register(String username, String password, String password2) throws BadAuthentificationException {
        username = username.trim();
        password = password.trim();
        password2 = password2.trim();
        dataValidator.validUsername(username);
        dataValidator.validPassword(password);
        dataValidator.equalPasswords(password, password2);

        Users user = Users.builder()
                .login(username)
                .password(password)
                .build();

        usersDAO.save(user);
//        try {
//            System.out.println(usersDAO.findPasswordByLogin("alchemist366"));
//        } catch (Exception e){}
//
//        for (Users us:
//             usersDAO.findAllByLogin("alchemist366")) {
//            System.out.println(us.toString());
//        }

//        Iterator<Users> iterator = usersDAO.findAll().iterator();
//        System.out.println(usersDAO.findNameById(user.getId()));
    }

    @Override
    public void auth(String username, String password) throws BadAuthentificationException {
        username = username.trim();
        password = password.trim();
        dataValidator.validUsername(username);
        dataValidator.validPassword(password);
    }
}
