import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y te dire cuantas palabras tiene: ");
        String input = new String(scanner.nextLine());
        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            String characterString = String.valueOf(character);
            if (characterString.equals(" ") || characterString.equals(".") || characterString.equals(",")) {
                contador++;
            }
        }

        System.out.println("La frase tiene " + ++contador + " palabras.");

        scanner.close();
    }
}
