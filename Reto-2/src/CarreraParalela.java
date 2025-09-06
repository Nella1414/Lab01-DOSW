package com.lab.retos;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reto 2: Carrera en Paralelo.
 * <p>
 * Simula el trabajo en paralelo de dos "carriles" (ramas) que calculan propiedades de listas de enteros
 * y al final unifican los resultados en un objeto {@link Resultados}.
 * <br><br>
 * Requisitos cubiertos:
 * - Uso de stream(), map(), filter(), collect().
 * - Unificación de máximo, mínimo, cantidad y derivaciones lógicas (par/impar, múltiplo/divisor de 2).
 * - Ejemplo de funciones (lambdas) independientes creadas por cada estudiante antes de la unificación.
 */
public final class CarreraParalela {

    /**
     * Lambda (Carril 1 - Estudiante B): calcula el máximo de una lista.
     */
    public static final Function<List<Integer>, Integer> CALCULAR_MAXIMO = lista ->
            Optional.ofNullable(lista)
                    .orElseThrow(() -> new IllegalArgumentException("La lista no puede ser null"))
                    .stream()
                    .filter(Objects::nonNull)
                    .max(Integer::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("La lista no puede estar vacía"));

}