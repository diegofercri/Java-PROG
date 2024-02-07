import java.util.ArrayList;

public class Ejer13 {
    /*
     * Crea un programa que almacene un array bidimensional (6x6) con pocos valores
     * en un array unidimensional. En el array unidimensional vamos almacenando
     * cada valor original junto con su fila y columna, es decir por cada valor del array
     * original almacenamos tres valores en el resultado.
     * Array original
     * 0 0 0 0 0 0
     * 0 0 0 0 5 0
     * 0 8 0 0 0 9
     * 0 0 0 0 0 0
     * 0 0 0 7 0 0
     * 0 0 3 0 0 0
     * Array resultado
     * 5 1 4 8 2 1 9 2 5 7 4 3 3 5 2
     */
    public static void main(String[] args) throws Exception {
        int original[][] = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 5, 0},
            {0, 8, 0, 0, 0, 9},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 7, 0, 0},
            {0, 0, 3, 0, 0, 0}
        };

        ArrayList<Integer> resultado = new ArrayList<Integer>();

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    resultado.add(original[i][j]);
                    resultado.add(i);
                    resultado.add(j);
                }
            }
        }

        System.out.println(resultado);
    }
}
