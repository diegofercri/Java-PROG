import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
    /*
     * Programa que simule el juego de las minas. El programa rellenará de forma
     * aleatoria un array de 5x5 con 10 minas. Una vez relleno, pedirá que escribamos
     * coordenada y mostrará el mensaje MINA, en caso de haber pisado una, o bien un
     * numero que indica cuantas minas hay alrededor.
     * 0 1 1 0 0
     * 1 0 1 0 1
     * 1 1 0 0 0
     * 0 0 0 0 1
     * 0 0 1 0 1
     * Ejemplo:
     * Coordenada Respuesta
     * (1,4) MINA
     * (1,1) 6
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[][] tablero = new int[5][5];
        int contador = 0;

        // Relleno el tablero
        while (contador < 10) {
            int fila = (int) (Math.random() * 5);
            int columna = (int) (Math.random() * 5);
            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = 1;
                contador++;
            }
        }
        
		// Imprimo el tablero para ver como ha quedado
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

        input.close();
    }
}
