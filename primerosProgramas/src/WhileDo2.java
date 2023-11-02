import java.util.Scanner;

public class WhileDo2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.print("Introduce numeros y los ire sumando hasta que introduzcas 0: ");
            num = scanner.nextInt();
            suma += num;
        } while (num != 0);
        
        System.out.println("El resultado de la suma es: "+suma);

        scanner.close();
    }
}
