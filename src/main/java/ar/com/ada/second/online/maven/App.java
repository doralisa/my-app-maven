package ar.com.ada.second.online.maven;

import ar.com.ada.second.online.maven.utils.Keyboard;
import ar.com.ada.second.online.maven.utils.Singletone;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboard1 = Keyboard.getInstance();
        Scanner keyboard2 = Keyboard.getInstance();

        Singletone singletone = Singletone.getInstance();
        System.out.println(singletone.getName());

        System.out.println("Hello World from maven project!");

    }

}
