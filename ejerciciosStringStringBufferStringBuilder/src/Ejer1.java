import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y la escribiré en mayúscualas:");
        String input = scanner.nextLine();
        int contador = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                contador++;
                output.append(Character.toUpperCase(c));
            } else {
                output.append(c);
            }
        }

        System.out.println("Cadena original: " + input);
        System.out.println("Cadena convertida: " + output);
        System.out.println("Número de cambios: " + contador);

        scanner.close();
    }
}
