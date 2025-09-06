package com.lab.retos;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Reto 5: Batalla de Conjuntos.
 * <p>Dos estudiantes generan arenas de números aleatorios y aplican reglas de filtrado distintas
 * usando estructuras de conjunto diferentes; luego se unifican.</p>
 * <ul>
 *   <li>Estudiante A: HashSet, elimina múltiplos de 3.</li>
 *   <li>Estudiante B: TreeSet (orden natural), elimina múltiplos de 5.</li>
 *   <li>Unificación: union en TreeSet, sin duplicados, impresión formateada.</li>
 * </ul>
 */
public final class BatallaConjuntos {

    private BatallaConjuntos() {}

    /**
     * Genera un HashSet de tamaño hasta 'cantidad' con números aleatorios en [0, limite) eliminando múltiplos de 3.
     * Duplicados implícitamente ignorados por la naturaleza del Set.
     * @param cantidad cantidad tentativa de números a generar
     * @param limite límite superior exclusivo
     * @param seed semilla para reproducibilidad
     * @return conjunto filtrado
     */
    public static Set<Integer> generarArenaHashSet(int cantidad, int limite, long seed) {
        Random rnd = new Random(seed);
        Set<Integer> base = new HashSet<>();
        for (int i = 0; i < cantidad; i++) {
            base.add(rnd.nextInt(limite));
        }
        // Eliminar múltiplos de 3 usando stream + filter + colecta a nuevo Set
        return base.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

}
