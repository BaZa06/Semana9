package ni.edu.uam.Ordenacion;
import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(80);
        numeros.add(25);
        numeros.add(15);
        numeros.add(60);
        numeros.add(5);

        Collections.sort(numeros);

        System.out.println(numeros);

    }
}


