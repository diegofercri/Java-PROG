import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce numeros y te dire cual es mayor y cuantas veces lo has introducido: ");
        int num;
        int numMayor = Integer.MIN_VALUE;
        int contador = 0;

        do {
            num = scanner.nextInt();
            if (num > numMayor) {
                numMayor = num;
                contador = 1;
            } else if (num == numMayor) {
                contador++;
            }
        } while (num != 0);
        
        System.out.println("El numero mayor es: "+numMayor);
        System.out.println("Lo has introducido "+contador+" veces");

        scanner.close();
    }
}