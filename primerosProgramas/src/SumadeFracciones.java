import java.util.Scanner;

public class SumadeFracciones {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce el numero de operaciones que quieres realizar: ");
        double numero = scanner.nextInt();
        double suma = 0;
        double contador = 1;

        while (suma < numero) {
            suma += 1 / contador; 
            contador ++;
        }

        System.out.println("La suma mas cercana es: " + suma);
        scanner.close();
    }
}
