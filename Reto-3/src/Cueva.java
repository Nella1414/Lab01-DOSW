import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Cueva {
    public static String ecoEspecial(String mensaje) {
 
        return new StringBuilder(mensaje).reverse().toString();
    }
    public static void main(String[] args) {
        java.util.function.Function<String, String> ecoLambda = Reto3Cueva::ecoEspecial;
        String mensaje = "HolaCueva";
        String resultado = ecoLambda.apply(mensaje);
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Eco especial: " + resultado);
    }
}