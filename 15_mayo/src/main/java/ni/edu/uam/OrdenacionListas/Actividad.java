package ni.edu.uam.OrdenacionListas;
import java.util.ArrayList;
import java.util.Collections;

public class Actividad {

    public static void main(String[] args) {

        System.out.println("EJERCICIO 1");
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(80);
        numeros.add(25);
        numeros.add(5);

        Collections.sort(numeros);

        System.out.println("Numeros ordenados de menor a mayor:");
        System.out.println(numeros);


        System.out.println("\nEJERCICIO 2");
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Cristopher");
        nombres.add("Bruno");
        nombres.add("Luis");
        nombres.add("Leticia");
        nombres.add("Carlos");

        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabeticamente:");
        System.out.println(nombres);


        System.out.println("\nEJERCICIO 3");
        ArrayList<Integer> numerosDescendentes = new ArrayList<>();

        numerosDescendentes.add(45);
        numerosDescendentes.add(12);
        numerosDescendentes.add(80);
        numerosDescendentes.add(25);
        numerosDescendentes.add(5);

        Collections.sort(numerosDescendentes, Collections.reverseOrder());

        System.out.println("Numeros ordenados de mayor a menor:");
        System.out.println(numerosDescendentes);
    }
}