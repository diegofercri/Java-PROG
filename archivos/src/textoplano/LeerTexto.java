package textoplano;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTexto {
    public static void main(String[] args) {
        File archive = new File("textoPlano.txt");

        BufferedReader stream = null;

        try {
            stream = new BufferedReader(new FileReader(archive));
            
            while (true) {
                String line = stream.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            /* SOLUCION 2
            String line = stream.readLine();
            while (line != null) {
                System.out.println(line);
                line = stream.readLine();
            }
            SOLUCION 3
            String line;
            while ((line = stream.readLine()) != null) {
                System.out.println(line);
            }
            */
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }
}
