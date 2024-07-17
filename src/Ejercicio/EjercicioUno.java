package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]                 
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

    public HashSet<HashSet<Integer>> subsets(List<Integer> set) {
        HashSet<HashSet<Integer>> subSets = new HashSet<>();
        HashSet<Integer> Sub = new HashSet<>(set);
        getSubSet(subSets, Sub, null);

        return subSets;
    }

    private void getSubSet(HashSet<HashSet<Integer>> subSets, HashSet<Integer> set, Integer i) {
        if (subSets.contains(set) || set.isEmpty()) {
            return; 
        }
        if (i == null) {
            for (Integer integer : set) {
                getSubSet(subSets, set, integer);
            }
            subSets.add(set);
        }
        HashSet<Integer> subSet = new HashSet<>();
        for (Integer integer : set) {
            if (integer != i) {
                subSet.add(integer);
            }
        }

        for (Integer integer : subSet) {
            getSubSet(subSets, subSet, integer);
        }
        subSets.add(subSet);

    }
}
