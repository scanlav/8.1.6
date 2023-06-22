package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 75);
        userService.saveUser("Petr", "Petrov", (byte) 65);
        userService.saveUser("Anton", "Antonov", (byte) 55);
        userService.saveUser("Nikolay", "Nikolaev", (byte) 45);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
