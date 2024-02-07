import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce el numero de ciclos de la secuencia de fibonacci: ");
        int num1 = 0;
        int num2 = 1;
        int ciclos = scanner.nextInt();
        int contador = ciclos / 2;

        for (int i = 0; i < contador; i++) {
            System.out.print(num1 + " ");
            num1 += num2;
            System.out.print(num2 + " ");
            num2 += num1;
        }

        if (ciclos % 2 != 0) {
            System.out.print(num1);
        }

        scanner.close();
    }
}
