import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero y te dire si sus cifras están ordenadas de forma ascendente o no: ");
        String num = scanner.nextLine();
        int anterior = 0;
        boolean orden = true;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            /* 
            Los numeros en codigo unicode tienen un valor igual a su valor + 48, es decir para el numero 1 su unicode es 1+48=49.
            Por lo que si le restamos 48 a c tendremo el valor de cada numero sin realizar conversiones.
            Aunque no es necesario ya que podemos comparar directamente su unidoce.
            */
            if (c - 48 >= anterior) {
                anterior = c - 48;
            } else {
                orden = false;
                break;
            }
        }

        if (orden) {
            System.out.println("Las cifras de " + num + " están ordenadas de menor a mayor.");
        } else {
            System.out.println("Las cifras de " + num + " no están ordenadas de menor a mayor.");
        }

        scanner.close();
    }
}
