import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce palabras y te dire si la palabra tiene alguna vocal repetida: ");
        String palabra = scanner.nextLine().toLowerCase();
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a') {
                contadorA++;
                if (contadorA == 3) {
                    System.out.println("La palabra tiene más de dos vocales.");
                    break;
                }
            } else if (c == 'e') {
                contadorE++;
                if (contadorE == 3) {
                    System.out.println("La palabra tiene más de dos vocales.");
                    break;
                }
            } else if (c == 'i') {
                contadorI++;
                if (contadorI == 3) {
                    System.out.println("La palabra tiene más de dos vocales.");
                    break;
                }
            } else if (c == 'o') {
                contadorO++;
                if (contadorO == 3) {
                    System.out.println("La palabra tiene más de dos vocales.");
                    break;
                }
            } else if (c == 'u') {
                contadorU++;
                if (contadorU == 3) {
                    System.out.println("La palabra tiene más de dos vocales.");
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
