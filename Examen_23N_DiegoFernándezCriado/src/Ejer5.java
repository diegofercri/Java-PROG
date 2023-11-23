import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer5 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que seleccione las palabras de la frase que contengan al
         * menos tres vocales distintas.
         * 
         * Ejemplo:
         * Teclea una frase: Me gusta muchisimo programar en lenguaje java
         * Resultado: muchisimo lenguaje
         * 
         * Nota: Supondremos que la frase que nos escriben por teclado está perfecta y
         * no
         * tiene símbolos ni cosas raras. El programa debe funcionar con mayúsculas y
         * minúsculas.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y te diré las palabras con más de 3 vocales distintas: ");
        StringTokenizer tkn = new StringTokenizer(scanner.nextLine());
        String palabra;
        StringBuilder sb = new StringBuilder("");

        while (tkn.hasMoreTokens()) {
            // Para cada palabra volvemos a declarar los contadores a 0 y la bandera en false
            int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0, contador = 0;
            boolean vocales = false;
            palabra = tkn.nextToken();
            /*
             * Para cada caracter comprobamos si coincide con una vocal, si coincide y no ha
             * coincidido antes sumamos 1 a los contadores
             * y si el contador es mayor a 2 subimos la bandera para saber que tiene 3
             * vocales distintas y rompemos el bucle.
             */
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.toLowerCase().charAt(i);
                if (c == 'a' && contadorA < 1) {
                    contadorA++;
                    contador++;
                    if (contador > 2) {
                        vocales = true;
                        break;
                    }
                } else if (c == 'e' && contadorE < 1) {
                    contadorE++;
                    contador++;
                    if (contador > 2) {
                        vocales = true;
                        break;
                    }
                } else if (c == 'i' && contadorI < 1) {
                    contadorI++;
                    contador++;
                    if (contador > 2) {
                        vocales = true;
                        break;
                    }
                } else if (c == 'o' && contadorO < 1) {
                    contadorO++;
                    contador++;
                    if (contador > 2) {
                        vocales = true;
                        break;
                    }
                } else if (c == 'u' && contadorU < 1) {
                    contadorU++;
                    contador++;
                    if (contador > 2) {
                        vocales = true;
                        break;
                    }
                }
            }
            // Si al terminar el bucle la bandera esta levantada añadimos la palabra en un StringBuilder
            if (vocales) {
                sb.append(palabra + " ");
            }
        }
        // Si el StringBuilder no está vacío imprimimos las palabras con mas de 3 vocales
        if (sb.length() > 0) {
            System.out.println("Las palabras con más de 3 vocales distintas son: " + sb.toString().trim());
        } else {
            System.out.println("La frase no tiene palabras con más de 3 vocales distintas.");
        }
        
        scanner.close();
    }
}
