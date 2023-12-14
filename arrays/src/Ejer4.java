public class Ejer4 {
    public static void main(String[] args) throws Exception {
        /*
         * Programa que ordene los índices de un array de enteros. A partir del array
         * original debe generar otro donde aparezcan ordenados los índices de mayor a
         * menor.
         * 
         * Array original:
         *  0  1  2  3  4
         * 34 54 12 85 45
         * Array resultado:
         * 3 1 4 0 2
         */
        int[] original = {34, 54, 12, 85, 45};
        int[] resultado = new int[original.length];
        int contador = 0;

        for (int i = 0; i < original.length; i++) {
            /*
             * Para cada numero del array original comprobamos que si es o no menor que el resto de numeros del array,
             * si es menor sumamos 1 al contador y si no no hacemos nada.
            */
            for (int j = 0; j < original.length; j++) {
                if (original[i] < original[j]) {
                    contador++;
                }
            }
            // Guardamos el contador en el array resultado ya que es el indice del numero en el array original.
            resultado[i] = contador;
            contador = 0;
        }
        
        // Imprimimos el array resultado
        for (int u = 0; u < resultado.length; u++) {
            System.out.print(resultado[u]);
        } 
    }
}