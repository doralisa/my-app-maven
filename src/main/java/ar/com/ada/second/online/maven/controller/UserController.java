package ar.com.ada.second.online.maven.controller;

import ar.com.ada.second.online.maven.model.dao.JpaUserDAO;
import ar.com.ada.second.online.maven.model.dao.UserDAO;
import ar.com.ada.second.online.maven.model.dto.UserDTO;
import ar.com.ada.second.online.maven.vista.MainView;
import ar.com.ada.second.online.maven.vista.UserView;

import java.util.HashMap;

public class UserController {
    private static UserController userController;
    private UserView userView = UserView.getInstance();
    private MainView mainView = MainView.getInstance();
    private JpaUserDAO jpaUserDAO = JpaUserDAO.getInstance();

    private UserController() {
    }

    public static UserController getInstance() {
        if (userController == null)
            userController = new UserController();

        return userController;
    }

    public void init() {
        boolean shouldItStay = true;
        userView.showTitleUserModule();

        while (shouldItStay) {
            Integer option = userView.UserMenuSelectOption();
            switch (option) {
                case 1:
                    createNewUser();
                    break;
                case 5:
                    shouldItStay = false;
                    mainView.showTitleReturnMenu();
                    break;
                default:
                    mainView.invalidOption();
                    break;
            }
        }
    }

    private void createNewUser() {
        HashMap<String, String> dataNewUser = userView.getDataNewUser();

        String nickname = dataNewUser.get("nickname");
        String email = dataNewUser.get("email");

        UserDTO userDTO = new UserDTO(nickname, email);

        try {
            jpaUserDAO.findByEmailOrNickname(userDTO.getEmail(), userDTO.getNickname());
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            userView.existingUser();
            return;
        }

        UserDAO userDAO = UserDAO.toDao(userDTO);

        jpaUserDAO.save(userDAO);

        userDTO.setId(userDAO.getId());

        userView.showNewUser(userDTO);

    }
}
