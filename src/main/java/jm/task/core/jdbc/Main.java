package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Джек", "Воробей", (byte) 31);
        userService.saveUser("Джо", "Байден", (byte) 54);
        userService.saveUser("Владимир", "Иванов", (byte) 74);
        userService.saveUser("Павел", "Снежок Воля", (byte) 38);

        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
