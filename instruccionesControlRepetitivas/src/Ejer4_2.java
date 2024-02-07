import java.util.Scanner;

public class Ejer4_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num, prevNum;
        boolean repetido = false;

        System.out.println("Introduce los números y te diré si existen números repetidos consecutivamente (para terminar, introduce un número negativo): ");

        // Hacemos una lectura anticipada, para no tener que inicializar la variable prevNum con un valor aleatorio.
        num = scanner.nextInt();
        prevNum = num;

        do {
            num = scanner.nextInt();
            if (num == prevNum) {
                repetido = true;
            }
            //  Me preparo para la siguiente vuelta
            prevNum = num;
        } while (num >= 0);

        if (repetido) {
            System.out.println("Hay números repetidos consecutivamente.");
        } else {
            System.out.println("No hay números repetidos consecutivamente.");
        }

        scanner.close();
    }
}
