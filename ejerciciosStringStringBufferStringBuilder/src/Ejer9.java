import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase para buscar cauntas veces se repite una palabra dentro de ella: ");
        String frase = scanner.nextLine().toLowerCase();
        System.out.print("Introduce la palabra que quieres buscar: ");
        String palabra = scanner.nextLine().toLowerCase();
        StringTokenizer tkn = new StringTokenizer(frase);
        int contador = 0;

        while (tkn.hasMoreTokens()) {
            String str = tkn.nextToken();
            if (str.equals(palabra)) {
                contador++;
            }
        }

        System.out.println("La palabra se repite: " + contador + " veces.");

        scanner.close();
    }
}
