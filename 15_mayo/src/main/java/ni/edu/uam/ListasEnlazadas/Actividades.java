package ni.edu.uam.ListasEnlazadas;

import java.util.LinkedList;

public class Actividades {

    public static void main(String[] args) {

        System.out.println("EJERCICIO 1");
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Numeros registrados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }


        System.out.println("\nEJERCICIO 2");
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Cristopher");
        nombres.add("Bruno");
        nombres.add("Luis");

        nombres.addFirst("Leticia");
        nombres.addLast("Carlos");

        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        System.out.println("\nEJERCICIO 3");
        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");
        productos.add("Impresora");

        System.out.println("Lista original de productos:");
        System.out.println(productos);

        productos.remove("Mouse");

        System.out.println("Lista despues de eliminar Mouse:");
        System.out.println(productos);
    }
}