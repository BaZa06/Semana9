package ni.edu.uam.ArrayList;

import java.util.ArrayList;

public class Actividades {

    public static void main(String[] args) {

        // Ejercicio 1
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Ejercicio 1 - Lista de numeros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();

        // Ejercicio 2
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Cristopher");
        estudiantes.add("Bruno");
        estudiantes.add("Luis");
        estudiantes.add("Leticia");

        estudiantes.remove("Luis");

        System.out.println("Ejercicio 2 - Lista actualizada de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println();

        // Ejercicio 3
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        System.out.println("Ejercicio 3 - Productos registrados:");
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Cantidad de productos registrados: " + productos.size());
    }
}
