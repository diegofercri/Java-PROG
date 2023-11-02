import java.util.Scanner;

public class For1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num, acumulador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero y lo sumare: ");
            num = scanner.nextInt();
            acumulador += num;
        }

        System.out.println("El resultado de la suma de los 5 numeros es: "+acumulador);

        scanner.close();
    }
}
