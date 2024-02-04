import java.util.Scanner;

public class Ejer5 {
    /*
     * Método fecha() que calculará el día del año al que corresponde una fecha en
     * formato día, mes.
     * fecha(1,1)=1
     * fecha(11,3)=70
     * fecha(31,12)=365
     */
    public static void main(String[] args) {
        System.out.print("Introduce el numero del dia: ");
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        System.out.print("Introduce el numero del mes: ");
        int mes = input.nextInt();

        System.out.println(fecha(dia, mes));

        input.close();
    }

    public static int fecha(int dia,int mes) {
        int fecha = dia;
        for (int i = 1; i < mes; i++) {
            if (i % 2 != 0) {
                fecha += 31;
            } else if (i == 2) {
                fecha += 28;
            } else {
                fecha += 30;
            }
        }
        return fecha;
    }
}
