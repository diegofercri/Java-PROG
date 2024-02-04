import java.util.Arrays;
import java.util.Scanner;

public class Ejer15 {
    /*
     * Escribe un programa que genere automáticamente un cuadro mágico. Un cuadro
     * mágico es aquel en el que todas sus filas, columnas y diagonales suman igual. Se
     * debe generar un cuadro de tamaño impar. Ejemplo si elegimos un cuadro de 5x5
     * este hay que rellenarlo con los números del 1 al 25.
     * El proceso de generación consiste en situar el número 1 en el centro de la
     * primera fila, el número siguiente en la casilla situada encima y a la derecha y así
     * sucesivamente. Suponemos que el array es cíclico, entonces la casilla encima de
     * la primera fila es la última fila, y la casilla a la derecha de la última es la
     * primera. En caso de caer en una casilla ya ocupada se coloca el número debajo
     * del que acabamos de colocar.
     * Este es el cuadro mágico de tamaño 3
     * 8 1 6
     * 3 5 7
     * 4 9 2
     */
    public static void main(String[] args) {
        System.out.print("Introduce la cantidad de numeros por lado del cuadrado (solo impar): ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[][] = new int[n][n];
        int col = n/2;
        int col2 = col;
        int row = 0;
        int row2 = row;

        for (int i = 1; i <= n*n; i++) {
            array[row][col] = i;
            // Cambio la fila teniendo en cuenta que la primera fila debe enlazar con la ultima, ya que no hay superior
            if (row == 0) {
                row2 = array.length - 1;
            } else {
                row2 = row - 1;
            }

            // Cambio la columna teniendo en cuenta que la ultima columna debe enlazar con la primera, ya que no hay siguiente a la derecha
            if (col == array.length - 1) {
                col2 = 0;
            } else {
                col2 = col + 1;
            }

            // Compruebo que no haya un numero en la casilla y si lo hay me bajo de fila, teniendo en cuenta que la ultima fila debe enlazar con la primera, y no cambio la columna
            if (array[row2][col2] != 0) {
                col2 = col;
                if (row == array.length - 1) {
                    row2 = 0;
                } else {
                    row2 = row + 1;
                }
            }

            // Paso los datos de row2 a row y de col2 a col
            row = row2;
            col = col2;
        }

        // Imprimo el array para ver como ha quedado
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        input.close();
    }
}
