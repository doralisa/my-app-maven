package ar.com.ada.second.online.maven.vista;

import ar.com.ada.second.online.maven.utils.Keyboard;

public class MainView {
    private static MainView mainView;

    private MainView() {
    }

    public static MainView getInstance() {
        if (mainView == null)
            mainView = new MainView();
        return mainView;
    }

    public void invalidOption () {
        System.out.println("ERROR:: debe ingresar una opción valida.\n");
    }

    public void showTitleApp () {
        System.out.println("***********************************************");
        System.out.println("**      BIENVENIDO A ADA SOCIAL NETWORK      **");
        System.out.println("***********************************************\n");
    }

    public void showTitleReturnMenu () {
        System.out.println("\n********************************");
        System.out.println("*      ADA SOCIAL NETWORK      *");;
        System.out.println("********************************\n");
    }

    public Integer mainMenuSelectionOption () {
        System.out.println("Seleccione un modulo en el que desea trabajar: ");
        System.out.println("| 1 | Usuarios");;
        System.out.println("| 5 | Finalizar App");
        return Keyboard.getInputInteger();
    }
}
