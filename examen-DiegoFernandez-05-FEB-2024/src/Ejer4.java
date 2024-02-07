import java.util.Scanner;
import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del cuadro: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[][] = new String[n][n];

        // Relleno todo el array con espacios para que no aparezcan nulls
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = " ";
            }
        }

        // Relleno la diagonal de izquierda a derecha con x
        for (int i = 0; i < n; i++) {
            array[i][i] = "x";
        }

        // Relleno la diagonal de derecha a izquierda con x
        for (int i = 0; i < n; i++) {
            array[i][n-i-1] = "x";
        }

        // Muestro el array
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        scanner.close();
    }
}
