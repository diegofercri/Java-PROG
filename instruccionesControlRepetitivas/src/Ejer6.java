import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el baseero a elevar: ");
        float base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        float exponente = scanner.nextInt();
        float pow = 0;

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                pow = base * base;
            }
        } else if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                pow = base * base;
            }
            pow = 1 / pow;
        } else {
            pow = 1;
        }

        System.out.println(pow);

        scanner.close();
    }
}
