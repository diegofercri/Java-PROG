import java.util.Scanner;

public class Ejer3 {
    /*
     * Crea una agenda para almacenar nombres y direcciones de N personas. Después
     * haz un programa que permita ir consultando el nombre y la dirección de las
     * personas almacenadas.
    */
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce el numero de contactos que quieres guardar: ");
        Scanner input = new Scanner(System.in);
        int numContactos = input.nextInt();
        input.nextLine();
        String contactos[][] = new String [numContactos][2];

        for (int i = 0; i < contactos.length; i++) {
            System.out.print("Introduce el nombre de la persona numero " + i + ": ");
            contactos[i][0] = input.nextLine();
            System.out.print("Introduce la direccion de la persona numero " + i + ": ");
            contactos[i][1] = input.nextLine();
        }

        System.out.print("Introduce el numero de la persona que quieres consultar: ");
        int numPersona = input.nextInt();
        System.out.println("Nombre: " + contactos[numPersona][0]);
        System.out.println("Direccion: " + contactos[numPersona][1]);
        
        input.close();
    }
}
