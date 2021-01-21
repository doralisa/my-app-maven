package ar.com.ada.second.online.maven.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {

    //1) Crear attr privado estatico de la instancia que queremos que sea única
    private static Scanner scanner;

    //2) El constructor debe ser privado
    private Keyboard() {
    }

    //3) Crear un metodo estatico y publico > getInstance()
    public static Scanner getInstance() {
        if (scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }

    //pressEnterToContinue
    public static void pressEnterToContinue() {
        System.out.println("Presione la tecla ENTER para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void invalidData() {
        System.out.println("ERROR :: Tipo de dato invalido, intente de nuevo.\n");
    }

    public static String getInputString() {
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;

        while (aux) {
            try {
                System.out.println("? ");
                txt = keyboard.nextLine().trim();
                while (!txt.isEmpty() && !txt.matches("^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            } catch (InputMismatchException e) {
                invalidData();
                keyboard.next();
            }
        }
        return txt;
    }

    public static Integer getInputInteger() {
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;

        while (aux) {
            try {
                System.out.println("? ");
                txt = keyboard.nextLine().trim();
                while (!txt.isEmpty() && !txt.matches("^[0-9]+$")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            } catch (InputMismatchException e) {
                invalidData();
                keyboard.next();
            }
        }
        return Integer.parseInt(txt);
    }

    public static Double getInputDouble() {
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;

        while (aux) {
            try {
                System.out.println("? ");
                txt = keyboard.nextLine().trim();
                while (!txt.isEmpty() && !txt.matches("^-?[0-9]{1,13}(\\.[0-9]*)?")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            } catch (InputMismatchException e) {
                invalidData();
                keyboard.next();
            }
        }
        return Double.parseDouble(txt);
    }
}

