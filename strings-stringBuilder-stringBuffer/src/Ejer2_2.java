import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer2_2 {
    public static void main(String[] args) throws Exception {
        // Probando la clase StringTokenizer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y te dire cuantas palabras tiene: ");
        // Creamos un objeto StringTokenizer
        // Por defecto, solo cuenta los espacios, así que le especificamos que trocee también con puntos y comas
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " .,");
        // Preguntamos cuantas palabra tiene la frase
        System.out.println("La frase tiene " + st.countTokens() + " palabras.");

        // Pedimos una palabra o token
        System.out.println("La primera palabra es: " + st.nextToken());
        // Pedimos el token siguiente
        System.out.println("La segunda palabra es: " + st.nextToken());

        // Volvemos a preguntarle cuantos tokens tiene la frase
        System.out.println("La frase tiene ahora " + st.countTokens() + " palabras");

        // Ahora vamos a pedirle todos los tokens restantes
        System.out.print("Los tokens restantes son: ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        scanner.close();
    }
}
