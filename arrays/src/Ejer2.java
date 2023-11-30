import java.util.Random;

public class Ejer2 {
    /*
     * Dado un numeros de números enteros, realiza un programa que diga si está
     * ordenado o no.
     */
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] numeros = new int[20];
        boolean ordenado = true;

        // Llenamos el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);  // Genera un número aleatorio entre 0 y 99
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("El numeros está ordenado.");
        } else {
            System.out.println("El numeros no está ordenado.");
        }
    }
}
