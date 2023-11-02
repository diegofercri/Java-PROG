import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce un numero y te dire su descomposicion en factores: ");
        int num = scanner.nextInt();

        System.out.println("La descomposicion factorial de "+num+" es: ");

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                System.out.println(i+" ");
                i = 2;
            }
        }

        scanner.close();
    }
}
