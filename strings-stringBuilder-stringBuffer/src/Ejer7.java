import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y sumare todas las cifras de los numeros que contenga: ");
        StringBuilder input = new StringBuilder(scanner.nextLine());
        int suma = 0;

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            if (Character.isDigit(caracter)) {
                int num = Character.getNumericValue(caracter);
                suma += num;
            }
        }

        System.out.println("La suma total es: " + suma);

        scanner.close();
    }
}
