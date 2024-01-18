import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Ejecutor claseAnonimaEjecutor = new Ejecutor () {
            @Override
            public String ejecutar (String parametro) {
                System.out.println("Hola desde una " + parametro);
                return parametro.toUpperCase();
            }
        };
        /*new Ejecutor() {
            @Override
            public void ejecutar() {
                System.out.println("Hola desde una clase anonima");
            }
        };*/

        Ejecutor lambdEjecutor = (parametro) -> {
            System.out.println("Hola desde lambda");
            return parametro.toLowerCase();
        };

        String resultadoClaseAnonima = claseAnonimaEjecutor.ejecutar("clase anonima");
        String resultadoLambda = lambdEjecutor.ejecutar("lambda");
        System.out.println(resultadoClaseAnonima);
        System.out.println(resultadoLambda);
    };
};