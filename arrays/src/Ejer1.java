import java.util.Scanner;

public class Ejer1 {
    /*
     * En un array de 20 elementos hay almacenados números enteros. Haz un
     * programa que pida un número y diga cuantas veces aparece el número dentro del
     * array.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número y te diré cuantas veces se repite: ");
        int num = scanner.nextInt();
        int[] numeros = { 5, 2, 3, 11, 5, 3, 11, 15, 15, 10, 11, 12, 5, 14, 15, 16, 15, 18, 5, 5 };
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                contador++;
            }
        }

        System.out.println("El numero se repite " + contador + " veces.");

        scanner.close();
    }
}
