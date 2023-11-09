import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y sumare todos los numeros que contenga: ");
        String input = scanner.nextLine();
        StringTokenizer tkn = new StringTokenizer(input);
        StringBuilder job = new StringBuilder("");
        int num = 0;
        boolean esNum = false;
        int suma = 0;

        while (tkn.hasMoreTokens()) {
            job.append(tkn.nextToken());
            for (int i = 0; i < job.length(); i++) {
                char c = job.charAt(i);
                if (Character.isDigit(c)) {
                    esNum = true;
                } else {
                    esNum = false;
                }
            }
            if (esNum) {
                String str = job.toString();
                num = Integer.parseInt(str);
                suma += num;
            }
            job.setLength(0);
        }

        System.out.println(suma);
    }
}
