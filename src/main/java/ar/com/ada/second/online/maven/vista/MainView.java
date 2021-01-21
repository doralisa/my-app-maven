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
<<<<<<< HEAD
        System.out.println("*      ADA SOCIAL NETWORK      *");;
=======
        System.out.println("*      ADA SOCIAL NETWORK      *");
>>>>>>> parent of 562eaf2... Revert "Actualización 20/01/2021"
        System.out.println("********************************\n");
    }

    public Integer mainMenuSelectionOption () {
        System.out.println("Seleccione un modulo en el que desea trabajar: ");
<<<<<<< HEAD
        System.out.println("| 1 | Usuarios");;
=======
        System.out.println("| 1 | Usuarios");
>>>>>>> parent of 562eaf2... Revert "Actualización 20/01/2021"
        System.out.println("| 5 | Finalizar App");
        return Keyboard.getInputInteger();
    }


}
