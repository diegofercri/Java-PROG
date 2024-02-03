import java.util.Random;

public class Ejer7 {
    /* 
     * Dado un array de 3x3 elementos, calcular la suma de sus filas y sus columnas
     * almacenándolas en dos array de 3 elementos.
    */
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int numeros[][] = new int[3][3];
        int suma = 0;

        // Rellenamos la matriz con numeros aleatorios y sacamos el total de las filas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = rand.nextInt(100);
                System.out.print(numeros[i][j] + " ");
                suma += numeros[i][j];
            }
            System.out.println(suma);
            suma = 0;
        }

        // Sacamos el total de las columnas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[j][i];
            }
            System.out.print(suma + " ");
            suma = 0;
        }
    }
}
