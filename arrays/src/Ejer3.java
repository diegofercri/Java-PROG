import java.util.Scanner;

public class Ejer3 {
    /*
     * Crea una agenda para almacenar nombres y direcciones de N personas. Después
     * haz un programa que permita ir consultando el nombre y la dirección de las
     * personas almacenadas.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de personas: ");
        int n = scanner.nextInt();

        // Declaramos un array bidimensional y le indicamos cuantas filas y cuantas columnas debe tener
        String[][] personas = new String[n][2];

        // Para cada fila del array pedimos un nombre y una direccion
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el nombre de la persona " + (i+1) + ": ");
            personas[i][0] = scanner.next();
            System.out.print("Introduce la dirección de la persona " + (i+1) + ": ");
            personas[i][1] = scanner.next();
        }

        // Pedimos el número de la fila de la persona a consultar
        System.out.print("Introduce el índice de la persona a consultar: ");
        int index = scanner.nextInt() - 1;
        // Imprimimos en pantalla las columnas de a la fila indicada por el usuario
        System.out.println("Nombre: " + personas[index][0]);
        System.out.println("Dirección: " + personas[index][1]);

        scanner.close();
    }
}
