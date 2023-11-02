import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce un numero y te dire si es primo: ");
        int num = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i < num-1; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
        }

        scanner.close();
    }
}
