import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra y la rotare las veces que indiques: ");
        String input = scanner.nextLine();
        System.out.print("Introduce el numero de veces que quieres que rote la palabra: ");
        int rotaciones = scanner.nextInt();

        int longitud = input.length();
        rotaciones = rotaciones % longitud;
        String output = input.substring(rotaciones) + input.substring(0, rotaciones);

        System.out.println("La palabra rotada es: " + output);

        scanner.close();
    }
}
