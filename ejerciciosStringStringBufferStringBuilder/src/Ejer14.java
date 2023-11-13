import java.util.Scanner;

public class Ejer14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos palabras e intercalare sus letras.");
        System.out.print("Introduce la primera palabra: ");
        String str = scanner.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String str1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int longitud;

        if (str.length() > str1.length()) {
            longitud = str.length();
        } else {
            longitud = str1.length();
        }

        for (int i = 0; i < longitud; i++) {
            if (i < str.length()) {
                sb.append(str.charAt(i));
            }
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
        }

        System.out.println(sb);

        scanner.close();
    }
}
