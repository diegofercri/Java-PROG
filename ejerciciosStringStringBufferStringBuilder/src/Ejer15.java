import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce palabras y te dire la palabra con más vocales, para terminar introduce FIN. ");
        StringBuilder mayor = new StringBuilder("");
        int vocales = 0;
        int maxVocales = 0;

        while (true) {
            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine().toUpperCase();
            vocales = 0;

            if (palabra.equals("FIN")) {
                break;
            }

            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vocales++;
                }
            }

            if (vocales > mayor.length()) {
                mayor.setLength(0);
                mayor.append(palabra);
                maxVocales = vocales;
            }

        }

        System.out.println(mayor + " es la palabra con mas vocales.");
        System.out.println("Tiene " + maxVocales + " vocales.");

        scanner.close();
    }
}
