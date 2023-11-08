import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra y la codificare en ASCII: ");
        String input = scanner.nextLine();
        String output = " ";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            c++;
            output += c;
        }

        System.out.println("El resultado es:" + output);

        scanner.close();
    }
}
