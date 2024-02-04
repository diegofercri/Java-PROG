import java.util.Scanner;

public class Ejer1 {
    /*
     * Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
     * y retorna un valor true en caso de que el carácter sea una vocal, y un valor false
     * en caso contrario.
     */
    public static void main(String[] args) {
        System.out.print("Introduce una letra: ");
        Scanner input = new Scanner(System.in);
        char letra = input.next().charAt(0);
        System.out.println(esVocal(letra));
        input.close();
    }

    public static boolean esVocal(char letra) {
        boolean esVocal = false;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            esVocal = true;
        }
        return esVocal;
    }
}
