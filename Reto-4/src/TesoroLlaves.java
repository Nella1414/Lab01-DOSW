import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public final class TesoroLlaves {

    /** Par clave-valor usado como entrada (simula registros sin estructura). */
    public record Par(String clave, String valor) {}

    private TesoroLlaves() {}

    /**
     * Estudiante A: Construye un HashMap ignorando claves duplicadas (conserva el primer valor observado).
     */
    public static Map<String,String> construirHashMap(List<Par> pares) {
        Map<String,String> mapa = new HashMap<>();
        if (pares == null) return mapa;
        pares.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.clave() != null)
                .forEach(p -> mapa.putIfAbsent(p.clave(), p.valor()));
        return mapa;
    }

}