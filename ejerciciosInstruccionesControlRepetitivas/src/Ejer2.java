import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int contadorMultiplos3 = 0;
        int contadorMultiplos5 = 0;
        int contadorNoMultiplos = 0;
        int num;

        System.out.println("Introduce 5 números:");

        for (int i = 0; i < 5; i++) {
            num = scanner.nextInt();
            if (num % 3 == 0) {
                contadorMultiplos3++;
            } 
            if (num % 5 == 0) {
                contadorMultiplos5++;
            } 
            if (num % 3 != 0 && num % 5 != 0) {
                contadorNoMultiplos++;
            }
        }

        System.out.println(contadorMultiplos3 + " son múltiplos de 3");
        System.out.println(contadorMultiplos5 + " son múltiplos de 5");
        System.out.println(contadorNoMultiplos + " no son múltiplos de nada");

        scanner.close();
    }
}
