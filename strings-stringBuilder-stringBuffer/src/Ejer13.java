import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce una frase y te dire la palabra con más letras: ");
        StringTokenizer tkn = new StringTokenizer(scanner.nextLine());
        int longitud = 0;
        StringBuilder mayor = new StringBuilder("");
        
        while (tkn.hasMoreTokens()) {
            StringBuilder str = new StringBuilder(tkn.nextToken());
            if (str.length() > longitud) {
                mayor.replace(0, longitud+1, str.toString());
                longitud = str.length();
            }
        }

        System.out.println(mayor);

        scanner.close();

    }
}
