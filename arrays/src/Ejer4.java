public class Ejer4 {
    /* 
     * Programa que ordene los índices de un array de enteros. A partir del array
     * original debe generar otro donde aparezcan ordenados los índices de mayor a
     * menor.
     * 
     * Array original
     *  0  1  2  3  4
     * 34 54 12 85 45
     * Array resultado
     * 3 1 4 0 2
     * 
    */
    public static void main(String[] args) throws Exception {
        int[] original = {34, 54, 12, 85, 45};
        int[] indices = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < original.length; i++) {
            for (int j = i + 1; j < original.length; j++) {
                if (original[indices[j]] > original[indices[i]]) {
                    int indice = indices[i];
                    indices[i] = indices[j];
                    indices[j] = indice;
                }
            }
        }

        System.out.println("Array resultado: " + java.util.Arrays.toString(indices));
    }
}
