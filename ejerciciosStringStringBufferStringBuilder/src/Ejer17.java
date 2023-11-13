import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejer17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducce tus asignaturas separadas por dos puntos (Ej. Matemáticas:Literatura:Historia:Inglés): ");
        StringTokenizer asignaturas = new StringTokenizer(scanner.nextLine(), ":");
        System.out.print("Introducce tus notas separadas por dos puntos (Ej. 7:4:10:3): ");
        StringTokenizer notas = new StringTokenizer(scanner.nextLine(), ":");
        StringBuilder aprobadas = new StringBuilder();

        while (notas.hasMoreTokens() && asignaturas.hasMoreTokens()) {
            String asignatura = asignaturas.nextToken();
            if (Integer.parseInt(notas.nextToken()) > 4) {
                aprobadas.append(asignatura + " ");
            }
        }

        System.out.println("Has aprobado: " + aprobadas);

        scanner.close();
    }
}
