import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabra = "diego";
        int longitud = palabra.length();
        StringBuilder oculta = new StringBuilder("");
        int contador = 0;
        int intentos = 0;
        boolean resultado = false;

        for (int i = 0; i < palabra.length(); i++) {
            oculta.append("_");
        }

        System.out.println("Vamos a jugar al ahorcado.");
        System.out.println("Estas son las letras que tienes que adivinar: " + oculta);

        while (intentos < 8) {
            System.out.print("\nIntroduce una letra: ");
            StringBuilder caracterUsu = new StringBuilder(scanner.nextLine().toLowerCase());
            int longitudUsu = caracterUsu.length();
            boolean soloLetras = caracterUsu.toString().matches("[a-z]");

            while (!soloLetras || longitudUsu > 1) {
                caracterUsu.setLength(0);
                System.out.println("\nUps, has introducido más de una letra o caracteres no alfabéticos.");
                System.out.println("Por favor, introduce una única letra.");
                System.out.print("\nIntroduce una letra: ");
                caracterUsu.append(scanner.nextLine().toLowerCase());
                longitudUsu = caracterUsu.length();
                soloLetras = caracterUsu.toString().matches("[a-z]");
            }            

            for (int i = 0; i < longitud; i++) {
                String caracter = String.valueOf(palabra.charAt(i));
                String strCaracterUsu = caracterUsu.toString();
                if (strCaracterUsu.equals(caracter)) {
                    oculta.replace(i, i+1, caracter.toString());
                    resultado = true;
                    contador++;
                } else if (resultado) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            }

            if (contador == longitud) {
                System.out.println("\nEnhorabuena, has acertado todas las letras de la palabra " + palabra + ".");
                break;
            } else if (resultado) {
                System.out.println("\nEnhorabuena, has acertado una letra.");
                System.out.println("Actualmente llevas este progreso: " + oculta);
                System.out.println("Te quedan " + (8 - intentos) + " intentos.");
            } else {
                System.out.println("\nLo siento, no has acertado con esa letra.");
                System.out.println("Actualmente llevas este progreso: " + oculta);
                intentos++;
                System.out.println("Te quedan " + (8 - intentos) + " intentos.");
            }

            resultado = false;

        }

        if (intentos == 8) {
            System.out.println("\nVaya, has perdido.");
        }

        scanner.close();
    }
}