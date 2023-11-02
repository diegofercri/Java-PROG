import java.util.Scanner;

public class AcertarRamdom2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int secreto = (int) (Math.random()*10), num, intentos = 0;

        do {
            System.out.print("\nIntroduce un numero del 1 al 10 hasta que aciertes: ");
            num = scanner.nextInt();

            if (num < secreto) {
                System.out.println("El numero es mayor que "+num);
                intentos ++;
            } else if (num > secreto) {
                System.out.println("El numero es menor que "+num);
                intentos ++;
            } else {
                System.out.println("Felicidades, has acertado.");
                break;
            }

        } while (intentos < 10);

        if (intentos == 10) {
            System.out.println("\nLo siento, has superado el máximo de 10 intentos.");
        } 

        scanner.close();
    }
}
