package com.lab.retos;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reto 2: Carrera en Paralelo.
 * Simula trabajo en paralelo de dos ramas que calculan propiedades sobre listas de enteros
 * y unifican en {@link Resultados}.
 */
public final class CarreraParalela {

    public static final Function<List<Integer>, Integer> CALCULAR_MINIMO = lista ->
            Optional.ofNullable(lista).orElseThrow(() -> new IllegalArgumentException("Lista null"))
                    .stream().filter(Objects::nonNull).min(Integer::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));

    
}