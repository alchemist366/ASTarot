package kpfu.aisalin.validation;

import kpfu.aisalin.exception.BadAuthentificationException;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class DataValidator  {
    private final Pattern patternUsername = Pattern.compile("^[A-Za-z0-9]{4,255}$");
    private final Pattern patternPassword = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
    public void validUsername(String username) throws BadAuthentificationException  {
        if ( !patternUsername.matcher(username).matches()) {
            throw new BadAuthentificationException("Имя пользователя должно быть длиннее 4 символов и состоять из цифр и букв английского алфавита");
        }
    }

    public void validPassword(String password) throws BadAuthentificationException {
        if (!patternPassword.matcher(password).matches()) {
            throw new BadAuthentificationException("Пароль недостаточно сложен: должны быть цифры, заглавные и строчные буквы и длина минимум 8 символов");
        }
    }


    public void equalPasswords(String password, String password2) throws BadAuthentificationException {
        if (!password.equals(password2)) {
            throw new BadAuthentificationException("Пароль и повтор пароля не совпадают");
        }
    }


}
