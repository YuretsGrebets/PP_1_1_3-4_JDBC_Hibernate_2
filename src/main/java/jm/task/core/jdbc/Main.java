package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Yuri", "Shtramyan", (byte) 22);
        userService.saveUser("Sergei", "Shtramyan", (byte) 21);
        userService.saveUser("Vadim", "Shtramyan", (byte) 20);
        userService.saveUser("Evgeniy", "Shtramyan", (byte) 19);

        for (User user : userService.getAllUsers()) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
