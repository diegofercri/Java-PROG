import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra y te dire si es palindroma: ");
        String sb = scanner.nextLine();
        String sb2 = new StringBuilder(sb).reverse().toString();

        if (sb.equals(sb2)) {
            System.out.println("La palabra es palindroma.");
        } else {
            System.out.println("La palabra no es palindroma.");
        }

        scanner.close();
    }
}
