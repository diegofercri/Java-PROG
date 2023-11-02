import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce un numero de una cifra: ");
        int numFila = scanner.nextInt();

        for (int j = 0; j <= numFila; j++) {
            for (int i = numFila; i > j; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i < j; i++) {
                System.out.print(i);
            }
            for (int i = j; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
