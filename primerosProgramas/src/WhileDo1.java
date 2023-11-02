import java.util.Scanner;

public class WhileDo1 {
    public  static void main(String[] args) throws Exception {
        //Forma incorreccta de realizarlo
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        while (num != 0) {
            System.out.print("Introduce un numero: ");
            num = scanner.nextInt();
        }

        //Forma correcta
        int num2;

        do {
            System.out.print("Introduce un numero 2: ");
            num2 = scanner.nextInt();
        }while(num2 != 0);

        scanner.close();
    }
}
