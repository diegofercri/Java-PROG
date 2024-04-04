package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarTemperaturas {
    public static void main(String[] args) {

        File archive = new File("temperatura.txt");
        try {
            DataOutputStream stream = new DataOutputStream(new FileOutputStream(archive));
            for (int i = 0; i < 10; i++) {
                stream.writeDouble(Math.random() * 50);
            }
            stream.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("El archivo no se puede escribir");
        }
    }
}
