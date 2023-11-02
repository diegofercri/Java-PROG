public class Ejer10 {
    public static void main(String[] args) throws Exception {
        for (int i = 100; i <= 999; i++) {
            int a = i / 100; // Obtener el primer dígito
            int b = (i / 10) % 10; // Obtener el segundo dígito
            int c = i % 10; // Obtener el tercer dígito

            int sumaCubos = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

            if (sumaCubos == i) {
                System.out.print(i + " ");
            }
        }
    }
}
