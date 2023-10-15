package lesson5;

import lesson5.exeptions.WrongLoginException;
import lesson5.exeptions.WrongPasswordException;

public class Main {
    public final static String PATTERN = "[\\w]{5,20}+";

    public static void main(String[] args) {
        try {
            registration("User_1", "Password", "password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean registration (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(PATTERN)) {
            throw new WrongLoginException("Логин неверной длины/содержит недопустимые символы");
        }
        if (!password.matches(PATTERN)) {
            throw new WrongPasswordException("Пароль неверной длины/содержит недопустимые символы");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
