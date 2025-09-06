package com.lab.retos;

/** DTO inmutable de resultados del Reto 2 */
public record Resultados(
        int maximo,
        int minimo,
        long cantidad
) {
    @Override public String toString() {
        return "Resultados{" +
                "max=" + maximo +
                ", min=" + minimo +
                ", cantidad=" + cantidad + '}';
    }
}