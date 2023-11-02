import java.util.Scanner;

public class CalcularCifras {
    public static void main (String args []) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce un numero y te dire su numero de cifras: ");
        int num = scanner.nextInt();
        int contador = 1;

        while (num / 10 != 0) {
            num /= 10;
            contador++;
        }
        
        System.out.println("El numero de cifras es: " + contador);

        scanner.close();
    }
}
