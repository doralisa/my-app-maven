package ar.com.ada.second.online.maven.controller;

public class UserController {
    private static UserController userController;

    private UserController () {}

    public static UserController getInstance() {
        if (userController == null)
            userController = new UserController();

        return userController;
    }
}
