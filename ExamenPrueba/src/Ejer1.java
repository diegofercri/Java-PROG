import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la edad a la q empzaste a perder pelo: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce el porcentaje de perdida de cabello anual (no introduzcas el símbolo '%'): ");
        double perdida = scanner.nextDouble() / 100;
        double cantidad = 100;

        while (cantidad >= 5) {
            cantidad -= cantidad * perdida;
            edad++;
        }

        System.out.println("Te quedarás calvo a los " + edad);
        scanner.close();
    }
}
