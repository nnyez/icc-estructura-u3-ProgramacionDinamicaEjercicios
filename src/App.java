import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {

        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        HashSet<HashSet<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);

        EjercicioDos ejerDos = new EjercicioDos();
        int n = 1;
        List<String> resul = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(resul);
        n = 3;
        resul = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
        System.out.println(resul);

    }
}
