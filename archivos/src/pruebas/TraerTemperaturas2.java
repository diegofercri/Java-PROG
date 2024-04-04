package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class TraerTemperaturas2 {
    public static void main(String[] args) {

        File archive = new File("temperatura.txt");
        DataInputStream stream = null;
        try {
            stream = new DataInputStream(new FileInputStream(archive));
            while (true) {
                System.out.println("Temperatura: " + stream.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("El archivo no se puede leer");
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }
}
