import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* 
            Podemos hacerlo así pero la manera más correcta es la indicada en el Ejer4_2, ya que aquí estmos inicializando
            la variable con un número aleatorio que hemos decidido nosotros y no es un input del usuario, mientras que en
            el Ejer4_2 la variable se inicializa con un valor que si es un input del usuario.
        */ 
        int num, prevNum = Integer.MAX_VALUE;
        boolean repetido = false;

        System.out.println("Introduce los números y te diré si existen números repetidos consecutivamente (para terminar, introduce un número negativo): ");

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
