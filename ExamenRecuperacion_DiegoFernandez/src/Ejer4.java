import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del cuadro: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[][] = new String[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = "x";
        }

        for (int i = 0; i < n; i++) {
            array[i][n-i-1] = "x";
        }
    }
}
