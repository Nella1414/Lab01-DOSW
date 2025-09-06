package com.lab.retos;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reto 4: Tesoro de las Llaves Duplicadas.
 * <p>
 * Flujo simulado de dos estudiantes trabajando en paralelo:
 * <ul>
 *   <li>Estudiante A: construye HashMap ignorando claves duplicadas (conserva el primer valor) y luego transforma claves a mayúsculas.</li>
 *   <li>Estudiante B: construye Hashtable (sincronizada) y agrega lógica para ordenar claves ascendentemente antes de imprimir.</li>
 *   <li>Ambos: crean el mismo método de combinación generando conflicto; se resuelve priorizando valores del Hashtable
 *       y aplicando transformaciones: mayúsculas + orden ascendente.</li>
 * </ul>
 * Requisitos: HashMap, Hashtable, stream(), map(), sorted(), Collectors.toMap().
 */
public final class TesoroLlaves {

    /** Par clave-valor usado como entrada (simula registros sin estructura). */
    public record Par(String clave, String valor) {}

    private TesoroLlaves() {}

    public static Hashtable<String,String> construirHashtable(List<Par> pares) {
        Hashtable<String,String> tabla = new Hashtable<>();
        if (pares == null) return tabla;
        pares.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.clave() != null)
                .forEach(p -> tabla.putIfAbsent(p.clave(), p.valor()));
        return tabla;
    }
}
