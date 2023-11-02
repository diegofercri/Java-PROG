import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contadorCeros = 0;
        int num;

        System.out.println("Introduce los números:");

        while (contadorCeros < 5) {
            num = scanner.nextInt();
            if (num == 0) {
                contadorCeros++;
            } else {
                suma += num;
            }
        }

        System.out.println("Resultado: "+suma);

        scanner.close();
    }
}
