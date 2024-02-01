public class Ejer2 {
    /* 
     * Dado un array de números enteros, realiza un programa que diga si está
     * ordenado o no.
    */
    public static void main(String[] args) throws Exception {
        int numeros[] = {1,2,3,4,7,6,7};
        int numAnterior = 0;
        boolean ordenado = true;

        for (int i = 0; i < numeros.length-1; i++) {
            int num = numeros[i];
            if (num >= numAnterior) {
                numAnterior = num;
            } else {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("El array esta ordenado de menor a mayor.");
        } else {
            System.out.println("El array no esta ordenado de menor a mayor.");
        }
    }
}
