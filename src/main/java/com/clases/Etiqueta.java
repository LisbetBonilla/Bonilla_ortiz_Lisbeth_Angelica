package main.java.com.clases;

import java.util.Scanner;

public class Etiqueta {
    public void datosDeEtiqueta(int eleccionDeUsuario, ObraDeArte[] ArrayDeObras) {
        System.out.println("Dime la obra que quieres ver: ");
        Scanner teclado = new Scanner(System.in);
        eleccionDeUsuario = teclado.nextInt();
        for (int i = 0; i < ArrayDeObras.length; i++) {
            if (ArrayDeObras[i].getId() == eleccionDeUsuario) {
                System.out.println("Nombre de la obra: " + ArrayDeObras[i].getNombre());
                System.out.println("Autor: " + ArrayDeObras[i].getAutor());
                System.out.println("Altura: " + ArrayDeObras[i].getAltura());
                System.out.println("Peso: " + ArrayDeObras[i].getPeso());
                System.out.println("Número de piezas: " + ArrayDeObras[i].getPiezas());
                System.out.println("Descripción: " + ArrayDeObras[i].getDescripcion());
            }
        }
    }

    public void imprimirEtiqueta(ObraDeArte[] ArryObras, int eleccionDeUsuario) {
        for (int i = 0; i < ArryObras.length; i++) {
            if (ArryObras[i].getId() == eleccionDeUsuario) {
                System.out.println("Nombre: " + ArryObras[i].getNombre());
                System.out.println("Autor: " + ArryObras[i].getAutor());
                System.out.println("Descripcion: " + ArryObras[i].getDescripcion());
            }
        }
    }


}
