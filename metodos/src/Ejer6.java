import java.util.Scanner;

public class Ejer6 {
    /*
     * Método repite(), que recibe como parámetro una cadena de caracteres y un
     * numero, y retorna un nuevo String donde aparece repetida la cadena de caracteres
     * tantas veces como indique el numero pasado como parámetro.
     */
    public static void main(String[] args) {
        System.out.print("Introduce la palabra: ");
        Scanner input = new Scanner(System.in);
        String palabra = input.nextLine();
        System.out.print("Introduce el numero de veces que quieres que se repita la palabra: ");
        int num = input.nextInt();

        System.out.println(repite(palabra, num));

        input.close();
    }

    public static String repite(String palabra, int num) {
        if (num > 0) {
            return palabra = palabra + repite(palabra, num - 1);
        } else {
            return "";
        }
    }
}
