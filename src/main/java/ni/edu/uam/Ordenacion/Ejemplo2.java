package ni.edu.uam.Ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo2 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("Juan");
        nombres.add("Andrea");

        Collections.sort(nombres);

        System.out.println(nombres);

    }
}
