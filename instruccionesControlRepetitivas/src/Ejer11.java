public class Ejer11 {
    public static void main(String[] args) throws Exception {
        int numFilas = 4;
        
        // Parte superior
        for (int i = 0 ; i <= numFilas ; i++) {
            for (int j = 0 ; j < numFilas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Parte inferior
        for (int i = numFilas - 1 ; i > 0 ; i--) {
            for (int j = numFilas - 1 ; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
