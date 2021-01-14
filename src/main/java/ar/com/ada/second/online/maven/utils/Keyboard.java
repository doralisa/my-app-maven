package ar.com.ada.second.online.maven.utils;

import jdk.nashorn.internal.objects.annotations.Constructor;

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
}
