import java.util.Scanner;

public class Ejer3 {
    /*
     * Realiza un método redondear() al que se le pasa como parámetro un numero float
     * y los decimales que deben quedar después de redondear, y retorna el numero
     * redondeado.
     * Ejemplo: redondear( 234.49234 , 3 )
     * Da como resultado : 234.492
     */
    public static void main(String[] args) {
        System.out.print("Introduce el numero a redondear: ");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.print("Introduce el numero de decimales que debe tener: ");
        int decimales = input.nextInt();

        System.out.println(redondear(num, decimales));

        input.close();
    }

    public static float redondear(float num, int decimales) {
        num = (float) (Math.round(num * Math.pow(10, decimales)) / Math.pow(10, decimales));
        return num;
    }
}
