package com.lab.retos;

/** DTO inmutable de resultados del Reto 2 */
public record Resultados(
        int maximo
) {
    @Override public String toString() {
        return "Resultados{" +
                "max=" + maximo ;
    }
}
