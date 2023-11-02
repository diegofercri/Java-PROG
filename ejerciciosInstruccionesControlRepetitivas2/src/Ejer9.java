import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero y lo convertire  binario: ");
        int decimal = scanner.nextInt();
        String binario = "";

        if (decimal == 0) {
            System.out.println(0);
        } else {
            while (decimal > 0) {
                int resto = decimal % 2;
                binario = resto + binario;
                decimal /= 2; 
            }
        }

        System.out.println(binario);

        scanner.close();
    }
}