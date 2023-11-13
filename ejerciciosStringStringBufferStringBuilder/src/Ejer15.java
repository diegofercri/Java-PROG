import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce palabras y te dire la palabra con más vocales, para terminar introduce FIN: ");
        String palabra = scanner.nextLine().toUpperCase();
        int contador = 0;
        StringBuilder mayor = new StringBuilder("");
        
        while (!palabra.equals("FIN")) {
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++;
                }
            if (contador > mayor.length()) {
                mayor.setLength(0);
                mayor.append(palabra);
            }
            contador = 0;
        }

        System.out.println(mayor + " es la palabra con mas vocales.");
        System.out.println("Tiene " + contador + " vocales.");

        scanner.close();

    }
}
