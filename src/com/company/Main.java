package com.company;

import java.util.Scanner;

public class Main {

    /* Ejercicio 2
    Escribir un programa que almacene la cadena de caracteres   contraseña   en una variable,
    pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida
    por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
     */
    public static void main(String[] args) {
        String contraseña;
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuál es la contraseña?");
        contraseña = scan.nextLine();

        if (contraseña.equals("contraseña")) {
            System.out.println("Es correcta");
        } else {
            System.out.println("No es correcta");
        }
    }
}
