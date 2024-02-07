import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y le quitaré las vocales: ");
        String str = scanner.nextLine().toLowerCase();

        String str2 = str.replaceAll("[aeiou]", "");

        System.out.println(str2);

        scanner.close();
    }
}
