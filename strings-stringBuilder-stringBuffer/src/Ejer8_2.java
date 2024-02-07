import java.util.Scanner;

public class Ejer8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase y sumare todos los numeros que contenga: ");
        String input = scanner.nextLine();
        StringBuilder job = new StringBuilder("");
        int num = 0;
        int suma = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char cprev = c;
            if (i != 0) {
                cprev = input.charAt(i-1);
            }
            
            if (Character.isDigit(c)) {
                job.append(c);
            } else if (Character.isDigit(cprev)) {
                String st = job.toString();
                num = Integer.parseInt(st);
                suma += num;
                job.setLength(0);
            } else {
                job.setLength(0);
            }
        }

        System.out.println(suma);

        scanner.close();
    }
}
