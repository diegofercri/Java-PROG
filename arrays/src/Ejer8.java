public class Ejer8 {
    /*
     * Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro
     * mágico aquel en el que las filas, las columnas y las diagonales suman igual.
     * 15 8 1 24 17
     * 16 14 7 5 23
     * 22 20 13 6 4
     * 3 21 19 12 10
     * 9 2 25 18 11
    */
    public static void main(String[] args) throws Exception {
        int numeros[][] = {
            {15, 8, 1, 24, 17},
            {16, 14, 7, 5, 23},
            {22, 20, 13, 6, 4},
            {3, 21, 19, 12, 10},
            {9, 2, 25, 18, 11},
        };
        int suma = 0;
        int sumas[] = new int[12];
        int contador = 0;
        boolean magico = true;

        //Sacamos el total de las filas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
            }
            sumas[contador] = suma;
            contador++;
            suma = 0;
        }

        // Sacamos el total de las columnas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[j][i];
            }
            sumas[contador] = suma;
            contador++;
            suma = 0;
        }

        //Sacamos el total de la diagonal de izq a der
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i][i];
        }
        sumas[contador] = suma;
        contador++;
        suma = 0;

        //Sacamos el total de la diagonal de der a izq
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i][(numeros.length-1)-i];
        }
        sumas[contador] = suma;
        contador++;
        suma = 0;

        for (int i = 0; i < sumas.length-1; i++) {
            if (sumas[i+1] != sumas[i]) {
                magico = false;
            }
        }

        if (magico) {
            System.out.println("El cuadrado es magico.");
        } else {
            System.out.println("El cuadrado no es magico.");
        }
    }
}
