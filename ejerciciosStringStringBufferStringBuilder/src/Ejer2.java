import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y te dire cuantas palabras tiene: ");
        String input = new String(scanner.nextLine());
        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            String caracterString = String.valueOf(caracter);
            if (caracterString.equals(" ") || caracterString.equals(".") || caracterString.equals(",")) {
                contador++;
            }
        }

        System.out.println("La frase tiene " + ++contador + " palabras.");

        scanner.close();
    }
}
