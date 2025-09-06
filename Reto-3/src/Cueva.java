import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Cueva {
    public static String ecoEspecial(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));
        StringBuilder builder = new StringBuilder(repetido);
        return builder.reverse().toString();
    }
    public static void main(String[] args) {
        java.util.function.Function<String, String> ecoLambda = Cueva::ecoEspecial;
        String mensaje = "HolaCueva";
        String resultado = ecoLambda.apply(mensaje);
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Eco especial: " + resultado);
    }
}