package ni.edu.uam.LinkedList;

import java.util.LinkedList;

public class Ejemplo2 {

    public static void main(String[] args) {

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Ana");
        nombres.add("Carlos");

        nombres.addFirst("María");

        nombres.addLast("José");

        System.out.println(nombres);

    }
}
