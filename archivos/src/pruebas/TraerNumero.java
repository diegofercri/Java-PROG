package pruebas;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TraerNumero {
    public static void main(String[] args) {
        File archive = new File("numero.txt");

        DataInputStream stream;
        try {
            stream = new DataInputStream(new FileInputStream(archive));

            int data = stream.read();

            stream.close();

            System.out.println("El numero es: " + data);
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");;
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");;
        }
    }
}
