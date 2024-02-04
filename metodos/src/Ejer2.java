import java.util.Scanner;

public class Ejer2 {
    /*
     * Escribe el método grados(), que convierta una temperatura en grados Celsius a
     * grados Fahrenheit. La formula de conversión es:
     * 
     * F = 32 + (9 * C / 5)
     */
    public static void main(String[] args) {
        System.out.print("Introduce la temperatura en Cº: ");
        Scanner input = new Scanner(System.in);
        int tempC = input.nextInt();
        System.out.println("La temperatuara en Fº es: " + grados(tempC));
        input.close();
    }

    public static int grados(int tempC) {
        int tempF = 32 + (9 * tempC / 5);
        return tempF;
    }
}
