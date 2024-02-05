public class Ejer3 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Relleno el array con numeros aleatorios del 1 al 99
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }

        int diferenciaCentro = Integer.MAX_VALUE;
        int indexCentro = -1;

        for (int i = 0; i < array.length; i++) {
            int sumaIzq = 0;
            int sumaDer = 0;

            // Calculamos la suma izquierda
            for (int j = 0; j < i; j++) {
                sumaIzq += array[j];
            }

            // Calculamos la suma derecha
            for (int j = i + 1; j < array.length; j++) {
                sumaDer += array[j];
            }

            // Calculamos la diferencia en valor absoluto
            int diferencia = Math.abs(sumaIzq - sumaDer);

            // Actualizamos el centro si es necesario
            if (diferencia < diferenciaCentro) {
                diferenciaCentro = diferencia;
                indexCentro = i;
            }
        }

        System.out.println("El centro de masas esta en la posicion: " + indexCentro + "\nY tiene una diferencia de: " + diferenciaCentro);
    }
}
