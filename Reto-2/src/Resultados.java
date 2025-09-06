package com.lab.retos;

/** DTO inmutable de resultados del Reto 2 */
public record Resultados(
<<<<<<< HEAD
        int maximo
) {
    @Override public String toString() {
        return "Resultados{" +
                "max=" + maximo ;
    }
}
=======
        int minimo

) {
    @Override public String toString() {
        return "Resultados{" +
                ", min=" + minimo + '}';
    }
}
>>>>>>> reto_carril_dos
