import java.util.Scanner;

public class For3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero y te diré su tabla de multiplicar: ");
        int num = scanner.nextInt();
        System.out.println("Tabla del " + num + ":");
        
        for (int i = 0; i < 11; i++) {
            int acumulador = num * i;
            System.out.println(num + " x " + i + " = " + acumulador);
        }

        scanner.close();
    }
}
