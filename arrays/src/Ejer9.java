import java.util.Arrays;

public class Ejer9 {
    /* 
     * Programa que mezcla dos arrays ordenados de N elementos, consiguiendo un
     * array de N*2 elementos igualmente ordenados.
     * Array A => 4 8 15 22 25 40
     * Array B => 3 6 18 21 25 47
     * Array C => 3 4 6 8 15 18 21 22 25 25 40 47
    */
    public static void main(String[] args) throws Exception {
        int arrayA[] = {4, 8, 15, 22, 25, 40};
        int arrayB[] = {3, 6, 18, 21, 25, 47};
        int arrayC[] = new int[arrayA.length+arrayB.length];

        // Copia los elementos del primer array al array unido
        System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);

        // Copia los elementos del segundo array al array unido
        System.arraycopy(arrayB, 0, arrayC, arrayA.length, arrayB.length);

        // Ordena el arrayC
        Arrays.sort(arrayC);

		// Imprimir el resultado
		System.out.println(Arrays.toString(arrayC));
    }
}
