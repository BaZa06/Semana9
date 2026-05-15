package ni.edu.uam.LinkedList;

import java.util.LinkedList;

public class Ejemplo3 {
    public static void main(String[] args) {
        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");

        productos.remove("Mouse");

        System.out.println(productos);

    }
    }
}
