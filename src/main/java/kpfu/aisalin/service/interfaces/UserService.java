package kpfu.aisalin.service.interfaces;

import kpfu.aisalin.exception.BadAuthentificationException;

public interface UserService {
    void register(String username, String password, String password2) throws BadAuthentificationException;

    void auth(String username, String password) throws BadAuthentificationException;
}
