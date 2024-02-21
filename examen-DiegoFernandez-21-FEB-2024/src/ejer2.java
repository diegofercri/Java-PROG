import java.util.Random;

public class ejer2 {
    public static void main(String[] args) {
        // Creo el array y lo relleno con números aleatorios
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        // Recorro el array tantas veces como elementos tenga y si en ese recorrido encuentro un numero igual sumo 1 al contador
        int[] arrayContador = new int[51];
        for (int i = 0; i < array.length; i++) {
            int contador = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }
            // Guardo las veces que se repite (contador) en la posición del array que es igual al número que estoy contando
            arrayContador[array[i]] = contador;
        }

        // Recorro el array de contadores y me quedo con el que más se repite
        int repetido = 0;
        int maxArrayContador = 0;
        for (int i = 1; i < arrayContador.length; i++) {
            if (arrayContador[i] > maxArrayContador) {
                repetido = i;
                maxArrayContador = arrayContador[i];
            }
        }

        System.out.println("El valor mas repetido es: " + repetido);
    }
}