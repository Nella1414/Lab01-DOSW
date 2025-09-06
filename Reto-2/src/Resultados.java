package com.lab.retos;

/** DTO inmutable de resultados del Reto 2 */
public record Resultados(
        int minimo

) {
    @Override public String toString() {
        return "Resultados{" +
                ", min=" + minimo + '}';
    }
}