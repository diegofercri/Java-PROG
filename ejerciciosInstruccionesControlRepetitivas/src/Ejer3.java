import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }

        scanner.close();
    }
}
