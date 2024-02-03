import java.util.Random;

public class Ejer5 {
    /* 
     * Dado un array de 50 números entre 1 y 100, Escribir una lista ordenada con los
     * valores que no aparecen en el array.
    */
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] array = new int[50];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        boolean array2[] = new boolean[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = false;
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    array2[i] = true;
                }
            }
        }

        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Numeros que no estan:");
        for (int i = 0; i < array2.length; i++) {
            if (!array2[i]) {
                System.out.println(i);
            }
        }
    }
}
