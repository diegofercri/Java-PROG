import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer6 {
    public static void main(String[] args) {
        /*
         * Siempre que escribimos un texto nos surge la duda de si estamos escribiendo
         * demasiadas palabras largas; así que vamos a hacer un programa que lea una
         * frase y nos diga la longitud media de las palabras.
         * 
         * Ejemplo:
         * Teclea una frase: Que la fuerza te acompañe
         * Longitud media: 4.2
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto y te dire la longitud media de sus palabras: ");
        StringTokenizer tkn = new StringTokenizer(scanner.nextLine());
        // Declaramos todas las variables con double para poder operar con decimales
        double suma = 0, contador = 0, media;
        // Mientras haya tokens sumamos su longitud y añadimos 1 al contador
        while (tkn.hasMoreTokens()) {
            suma += tkn.nextToken().length();
            contador++;
        }
        // Realizamos la media de la longitud
        media = suma / contador;
        // Imprimimos el resultado
        System.out.println("La longitud media de las palabras es: " + media);

        scanner.close();
    }
}
