package pruebas;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class TraerTemperaturas {
    public static void main(String[] args) {

        File archive = new File("temperatura.txt");
        try {
            DataInputStream stream = new DataInputStream(new FileInputStream(archive));
            for (int i = 0; i < 10; i++) {
                System.out.println("Dia: " + i + " Temperatura: " + stream.readDouble());
            }
            stream.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("El archivo no se puede leer");
        }
    }
}
