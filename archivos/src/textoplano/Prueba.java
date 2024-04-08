package textoplano;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {
    public static void main(String[] args) {
        
        File archive = new File("textoPlano.txt");
        
        BufferedWriter stream = null;

        try {
            stream = new BufferedWriter(new FileWriter(archive));
            stream.write("Hola mundo");
        } catch (IOException e) {
            System.out.println("No se puede escribir el archivo");
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
