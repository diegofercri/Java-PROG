import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra y la codificare en ASCII: ");
        String input = scanner.nextLine();
        String output = " ";

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            caracter++;
            output += caracter;
        }

        System.out.println("El resultado es:" + output);

        scanner.close();
    }
}
