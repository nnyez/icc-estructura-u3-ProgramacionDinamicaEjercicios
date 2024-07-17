package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(list, new StringBuilder(), 0, 0, n);
        return list;

    }

    public void generateParenthesis(List<String> list, StringBuilder stringBuilder, int open, int closed, int n) {
        if (stringBuilder.length() == n * 2) {
            list.add(stringBuilder.toString());

            return;
        }

        if (open < n) {
            stringBuilder.append('(');

            generateParenthesis(list, stringBuilder, open + 1, closed, n);

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (closed < n) {
            stringBuilder.append(')');

            generateParenthesis(list, stringBuilder, open, closed + 1, n);

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

}
