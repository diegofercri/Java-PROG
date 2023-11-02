import java.util.Scanner;

public class AcertarRamdom {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int secreto = (int) (Math.random()*10), num;

        do {
            System.out.print("Introduce un numero del 1 al 10 hasta que aciertes: ");
            num = scanner.nextInt();
        } while (num != secreto);

        System.out.println("Felicidades, has acertado.");

        scanner.close();
    }
}