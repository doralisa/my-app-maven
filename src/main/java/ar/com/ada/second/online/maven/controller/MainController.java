package ar.com.ada.second.online.maven.controller;

import ar.com.ada.second.online.maven.vista.MainView;

public class MainController {
    private static MainController mainController;
    private MainView mainView = MainView.getInstance();

    private MainController () {}

    public static MainController getInstance() {
        if (mainController == null)
        mainController = new MainController();

        return mainController;
    }

    public void init() {
        boolean shouldItStay = true;
        mainView.showTitleApp();

        while (shouldItStay) {
            Integer option = mainView.mainMenuSelectionOption();
            switch (option) {
                case 1:
                    //llamaria al controlador de usuario
                    System.out.println("llamar al controlador de usuario");
                    break;
                case 5:
                    shouldItStay = false;
                    break;
                default:
                    mainView.invalidOption();
                    break;
            }
<<<<<<< HEAD
=======

>>>>>>> parent of 562eaf2... Revert "Actualización 20/01/2021"
        }
    }
}
