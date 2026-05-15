package ni.edu.uam.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo3 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(14);
        numeros.add(7);
        numeros.add(90);
        numeros.add(25);

        Collections.sort(
                numeros,
                Collections.reverseOrder()
        );

        System.out.println(numeros);

    }
}
