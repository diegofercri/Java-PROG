import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce una frase y eliminare las palabras que tengan menos de 3 letras: ");
        StringTokenizer tkn = new StringTokenizer(scanner.nextLine());
        StringBuilder sb = new StringBuilder("");
        
        while (tkn.hasMoreTokens()) {
            String str = tkn.nextToken();
            if (str.length() > 2) {
                sb.append(str + " ");
            }
        }

        System.out.println(sb);

        scanner.close();

    }
}
