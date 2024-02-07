import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número y le añadiré las comas a los miles: ");
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), ".");
        StringBuilder output = new StringBuilder("");
        StringBuilder num = new StringBuilder(st.nextToken());
        int longitud = num.length();

        while (longitud % 3 != 0) {
            longitud++;
            num.insert(0,"0");
        }

        for (int i = 0; i < longitud; i = i + 3) {
            output.append(num.substring(i, i + 3));
            if (i!=longitud-3) {
                output.append(",");
            }
        }

        output.append("."+st.nextToken());

        System.out.println("El número es: " + output);

        scanner.close();

    }
}
