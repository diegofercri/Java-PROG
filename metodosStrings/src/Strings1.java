import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un correo electrónico:");
        String email = scanner.nextLine();
        int posicionArroba = email.indexOf("@");
        int posicionPunto = email.lastIndexOf(".");

        if (posicionArroba > 3 && posicionPunto > posicionArroba && (email.endsWith(".com") || email.endsWith(".es"))) {
            System.out.println("El email es correcto");
        } else {
            System.out.println("El email es incorrecto");
        } 

        scanner.close();
    }
}