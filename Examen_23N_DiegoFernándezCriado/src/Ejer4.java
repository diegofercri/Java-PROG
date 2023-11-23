import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*
            Realiza un programa que averigua si un número es vampiro o no. El método
            debe recibir como parámetro un número entero de 4 cifras y responderá si el
            número es vampiro o no.
            Para averiguar si un número es vampiro hay que dividirlo en dos partes(dos
            colmillos), darle la vuelta a la primera parte(colmillo retorcido) y luego
            multiplicamos las dos partes a ver si obtenemos el número original.
            Ejemplo de cómo funciona:
            Teclea un número de 4 cifras: 1435
            Resultado: Es Vampiro
            Se divide el número en dos partes

            14 y 35

            Se le da la vuelta al primer número

            41 y 35

            Luego hace la multiplicación de los dos trozos

            41 x 35 = 1435

            Como el resultado de la multiplicación es el número original, entonces
            responderá que es “Vampiro”.
            Otros números vampiros son el 1260,1530 y 6880.

            Nota. Si se teclea un número que no tenga 4 cifras, se debe pedir otro hasta que
            pongan uno correcto.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de 4 cifras y te diré si es vampiro o no: ");
        String numstr = scanner.nextLine();

        //Comprobamos que el numero introducido tiene exactamente 4 cifras
        while (numstr.length() != 4) {
            System.out.println("Ups, no has introducido un número de 4 cifras.");
            System.out.print("Vuelve a introducir un número, por favor: ");
            numstr = scanner.nextLine();
        }

        //Pasamos el numero de string a entero para trabajar con él
        int num = Integer.parseInt(numstr);

        // Dividimos el número en dos partes
        int num1 = num / 100;
        int num2 = num % 100;

        // Damos la vuelta a la primera parte
        int digito1 = num1 / 10;
        int digito2 = num1 % 10;
        num1 = digito2 * 10 + digito1;

        // Hacemos la multiplicación de las dos partes
        int multiplicacion = num1 * num2;
        
        // Comprovamos si es o no igual
        if (multiplicacion == num) {
            System.out.println("El número " + num + " es vampiro.");
        } else {
            System.out.println("El número " + num + " no es vampiro.");
        }
    }
}
